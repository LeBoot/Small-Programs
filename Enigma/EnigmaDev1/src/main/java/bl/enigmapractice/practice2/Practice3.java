/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigmapractice.practice2;

import java.util.Random;

/**
 *
 * @author Boone
 */
public class Practice3 {
    /*
    The maximum length of new strings
    */
    private final int LENGTH = 64;
    
    /*
    Array of characters to be used when building strings.
    */
    private final String[] VALID_CHARACTERS = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
        "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d",
        "e", "f", "g", "h", "i", "j", "k", "m", "n", "o",
        "p", "q", "r", "s", "t", "u", "v", "w", "x", "y",
        "z", "!", "@", "#", "$", "%", "&", "?"
    };
    
    /*
    Method to generate new keys.
    NOTE: public for testing ------------------------------------------------------------------- ADDRESS THIS
    */
    public int[] generateNewKey() {
        Random randGen = new Random();
        int[] newKey = new int[LENGTH];
        int max = LENGTH;
        int min = 0;
        
        for (int i = 0; i < LENGTH; i++) {
            newKey[i] = randGen.nextInt((max - min) + 1) + min;
        }
        
        return newKey;
    }
    
    /*
    Ensure that the incoming string contains only the approved characters.
    If not, throw an error
    */
    private void validateCharacters(String s) throws InvalidInputException {
        for (int i = 0; i < s.length(); i++) { 
            String substring = s.substring(i, i + 1);
            boolean isMatched = false;
            for (String validChar : VALID_CHARACTERS) {
                if (substring.equals(validChar)) {
                    isMatched = true;
                }
            }
            if (isMatched == false) {
                throw new InvalidInputException("Invalid Character");
            }
        }
    }
    
    /*
    Ensure the the length of the incoming string is between 1 and LENGTH (64) (inclusively).
    If no, then an error is thrown.
    If yes, then the length of the string is build to 64 characters (if necessary)
        by build a new string from multiple full and/or partial copies of input
        string until the total length is equal to LENGTH.
    */
    private String validateLength(String s) throws InvalidInputException {
        int l = s.length();
        if (l > LENGTH) {
            throw new InvalidInputException("Invalid Length: Too long.");
        }
        if (l < 1) {
            throw new InvalidInputException("Invalid Length: Too short.");
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
    
    /*
    Takes in a 64-character string that is known to contain only valid characters,
        and encrypts that string based on the KEY.
    */
    private String buildEncryptedString(String s, int[] key) {
        int l = VALID_CHARACTERS.length;
        String[] doubleValidCharacters = new String[l * 2];
        for (int i = 0; i < (l * 2); i++) {
            if (i < l) {
                doubleValidCharacters[i] = VALID_CHARACTERS[i];
            } else {
                doubleValidCharacters[i] = VALID_CHARACTERS[i - l];
            }
        }
        
        String newString = "";
        for (int i = 0; i < s.length(); i++) { 
            String substring = s.substring(i, i + 1);
            for (int j = 0; j < l; j++) {
                if (VALID_CHARACTERS[j].equals(substring)) {
                    newString += doubleValidCharacters[j + key[i]];
                }
            }
        }
        
        return newString;
    }
    
    /*
    This is the public method to encrypt a string.
    It valiates that the string length is between 1 and LENGHT (64) (inclusively).
    It also validates that the strings characters are approved (in VALID_CHARACTERS).
    If both of these conditions are met, it will return a 64-character long string that
        is made of approved characters and is encrypted based on a KEY.
    NOTES: How should this key come in? -------------------------------------------------------------------------- ADDRESS THIS
    */
    public String encryptString(String s, int[] key) throws InvalidInputException {
        try {
            validateCharacters(s);
            s = validateLength(s);
            return buildEncryptedString(s, key);
        } catch (InvalidInputException e) {
            throw e;
        }
    }

}
