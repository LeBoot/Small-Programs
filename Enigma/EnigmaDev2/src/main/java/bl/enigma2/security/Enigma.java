/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigma2.security;

import java.util.Random;

/**
 *
 * @author Boone
 */
public class Enigma {
    
    //CONSTANTS ================================================================
    
    /*
    The maximum length of new strings.
    */
    private final int LENGTH = 64;
    
    /*
    Array of valid characters.  This determines both what characters can be con-
        tained in the incoming string, as well as what characters will compose
        the output (encrypted) string.
    */
    private final String[] VALID_CHARACTERS = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
        "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d",
        "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
        "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
        "y", "z", "!", "@", "#", "$", "%", "&", "?"
    };
    
    /*
    Delimiter for keys.
    */
    private final String DELIMITER = ":";
    
    
    //PUBLIC METHODS ===========================================================
    
    /*
    This is the public method to encrypt a string.
    It valiates that the string length is between 1 and LENGHT (64) (inclusively).
    It also validates that the strings characters are approved (in VALID_CHARACTERS).
    If both of these conditions are met, it will return a string array:
        - Array[0] will be the encrypted string, formed from the array of valid
            characters, and of length LENGTH (64).
        - Array[1] will be the key that was used to encrypt (and must be used to
            decrpyt) the string.  It's length will be less than 200.
    */
    public String[] encryptString(String s) throws InvalidPasswordException, InvalidKeyException {
        String[] returnArray = new String[2];
        try {
            validateCharacters(s);
            String key = generateNewKey(s);
            s = validateLength(s);
            returnArray[0] = buildEncryptedString(s, key);
            returnArray[1] = key;
            return returnArray;
        } catch (InvalidPasswordException | InvalidKeyException e) {
            throw e;
        }
    }
    
    /*
    Matches an unencrypted string (incoming password) to an encrypted string + key
        (storred password and key).
    Returns true if the two match.
    Retursn false otherwise.
    */
    public boolean matchStringToEncryptedString(String encrypted, String unencrypted, String key) {
        boolean isMatched = false;
        
        try {
            unencrypted = validateLength(unencrypted);
            encrypted = decryptString(encrypted, key);
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            return false;
        }
        
        if (unencrypted.equals(encrypted)) {
            isMatched = true;
        }       
        
        return isMatched;
    }
    
    
    /*
    This will fully decrypt a string and return the original input that created the
        encrypted String.
    It should not be used in production.  For exceptional circumstnaces only.
    */
    public String fullyDecryptString(String s, String key) throws InvalidKeyException {
        String sixtyFour = decryptString(s, key);
        return sixtyFour.substring(0, dissectKey(key)[0]);
    }
    
    
    //HELPER METHODS ===========================================================
    
    /*
    Takes in a 64-character string that is known to contain only valid characters,
        and encrypts that string based on the KEY.
    */
    private String buildEncryptedString(String s, String key) throws InvalidKeyException {
        String[] doubleValidCharacters = doubleValidCharacters();
        int[] keyAr = dissectKey(key);
        
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i, i + 1);
            for (int j = 0; j < VALID_CHARACTERS.length; j++) {
                if (VALID_CHARACTERS[j].equals(substring)) {
                    newString += doubleValidCharacters[j + keyAr[i + 1]];
                }
            }
        }
        
        return newString;
    }
    
    /*
    Uses an encrypted string and the key that was used to encrypt it and returns
        the 64-character decrypted string from which it was built.
    NOTE: public for testing -------------------------------------------------------------------------- ADDRESS THIS
    */
    public String decryptString(String encrypted, String key) throws InvalidKeyException {
        String decrypted = "";
        String[] doubleValid = doubleValidCharacters();
        int[] keyAr = dissectKey(key);
        for (int i = 0; i < encrypted.length(); i++) {
            String sub = encrypted.substring(i, i + 1);
            for (int j = 0; j < doubleValid.length; j++) {
                if (sub.equals(doubleValid[j])) {
                    int originalIndex = j - keyAr[i + 1];
                    if (originalIndex >= 0 && originalIndex <= VALID_CHARACTERS.length - 1) {
                        decrypted += VALID_CHARACTERS[originalIndex];
                        break;
                    }
                }
            }
        }
        return decrypted;
    }
    
    /*
    Takes in a key and returns it as an integer array of length 64, with each
        index being a token of the key.
    NOTE: public for testing -------------------------------------------------------------------------------- ADDRESS THIS
    */
    public int[] dissectKey(String key) throws InvalidKeyException {
        try {
            String[] strAr = key.split(DELIMITER);
            int[] intAr = new int[strAr.length];

            for (int i = 0; i < strAr.length; i++) {
                intAr[i] = Integer.parseInt(strAr[i]);
            }

            return intAr; 
        } catch (Exception e) {
            throw new InvalidKeyException();
        }       
    }
    
    /*
    Creates an array that is a concatenation of the VALID_CHARACTERS array with itself.
    NOTE: Public for testing ---------------------------------------------------------------------------------- ADDRESS THIS
    */
    public String[] doubleValidCharacters() {
        int l = VALID_CHARACTERS.length;
        String[] doubled = new String[l * 2];
        
        for (int i = 0; i < (l * 2); i++) {
            if (i < l) {
                doubled[i] = VALID_CHARACTERS[i];
            } else {
                doubled[i] = VALID_CHARACTERS[i - l];
            }
        }
        
        return doubled;
    }
    
    /*
    Method to generate new keys.
    The key tokens will be randomly generated and have values between 0 and the
        length of the VALID_CHARACTERS array (less 1).
    The number of tokens generated is determined the the LENGTH of new strings.
    The key will be returned as a string with the DELIMITER character separating
        the individual tokens. (E.g., "[original length]:[token1]:[token2]:...:[token64]")
    The length of the key will be between 128 and 193 (if the delimiter is 1 character).
        (64 tokens * 2 digit max) + 63 delimiters + (1 or 2 digit original length).
    NOTE: Public for testing ---------------------------------------------------------------------------------- ADDRESS THIS
    */
    public String generateNewKey(String s) {
        Random randGen = new Random();
        String newKey = Integer.toString(s.length()) + ":";
        int max = VALID_CHARACTERS.length - 1;
        int min = 0;
        
        for (int i = 0; i < LENGTH; i++) {
            int keyTokenInt = randGen.nextInt((max - min) + 1) + min;
            if (i == (LENGTH - 1)) {
                newKey += Integer.toString(keyTokenInt);
            } else {
                newKey += Integer.toString(keyTokenInt) + DELIMITER;
            }
        }
        
        return newKey;
    }
    
    /*
    Ensure that the incoming string contains only the approved characters.
    If not, throw an error.
    */
    private void validateCharacters(String s) throws InvalidPasswordException {
        for (int i = 0; i < s.length(); i++) { 
            String substring = s.substring(i, i + 1);
            boolean isMatched = false;
            for (String validChar : VALID_CHARACTERS) {
                if (substring.equals(validChar)) {
                    isMatched = true;
                    break;
                }
            }
            if (isMatched == false) {
                throw new InvalidPasswordException("Invalid Character: " + substring);
            }
        }
    }
    
    /*
    Ensure that the length of the incoming string is between 1 and LENGTH (64) (inclusively).
    If no, then an error is thrown.
    If yes, then the length of the string is build to 64 characters (if necessary)
        by build a new string from multiple full and/or partial copies of input
        string until the total length is equal to LENGTH.
    */
    private String validateLength(String s) throws InvalidPasswordException {
        int l = s.length();
        if (l > LENGTH) {
            throw new InvalidPasswordException("Invalid Length: Too long.");
        }
        if (l < 1) {
            throw new InvalidPasswordException("Invalid Length: Too short.");
        }
        
        while (l < LENGTH) {
            if (l <= (LENGTH/2)) {
                s += s;
            } else {
                s += s.substring(0, (LENGTH - l));
            }
            l = s.length();
        }
        
        return s;
    }    
    
}
