/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigmadevv2.enigma;

import java.util.Random;

/**
 *
 * @author Boone
 */
public class EnigmaImpl implements Enigma {    
    
    //OBJECTS AND CONSTANTS ====================================================
    //--------------------------------------------------------------------------
    EnigmaVC evc = new EnigmaVC();
    Random rand = new Random();
    
    private final String DELIMITER = ":";
    
    
    //PUBLIC METHODS ===========================================================
    //--------------------------------------------------------------------------
    @Override
    public boolean doPasswordsMatch(String input, EnigmaEntity ee) {
        try {
            return input.equals(decrypt(ee));
        } catch (EnigmaException e) {
            return false;
        }
    }
    
    @Override
    public EnigmaEntity encryptPassword(String input) throws EnigmaException {
        try {
            return encryptPassword(input, 64, 4, 64);
        } catch (EnigmaException e) {
            throw e;
        }
    }
    
    @Override
    public EnigmaEntity encryptPassword(String input, int outputLength, int minInputLength, int maxInputLength)
            throws EnigmaException {
        if ((minInputLength < 2) || (minInputLength > maxInputLength)) {
            minInputLength = 2;
        }
        if ((outputLength > 512) || (maxInputLength > 512)) {
            maxInputLength = 512;
            outputLength = 512;
        }
        if (outputLength < maxInputLength) {
            outputLength = maxInputLength;
        }
        try {
            validateInput(input, minInputLength, maxInputLength);
            String key = buildNewKey(input, outputLength);
            return buildEncryptedPassword(input, key, outputLength);
        } catch (EnigmaException e) {
            throw e;
        }
    }
    
    
    //PRIVATE METHODS ==========================================================
    //--------------------------------------------------------------------------  
    private EnigmaEntity buildEncryptedPassword(String input, String key, int outputLength) throws EnigmaException {
        int[] keyAr = dissectKey(key);
        String[] singleEVC = evc.getEVC(keyAr[keyAr.length - 1]);
        String[] doubleEVC = doubleEVC(singleEVC);
        
        String encPass = "";
        input = growInput(input, outputLength);
        for (int i = 0; i < input.length(); i++) {
            String sub = input.substring(i, i+1);
            for (int j = 0; j < singleEVC.length; j++) {
                if (singleEVC[j].equals(sub)) {
                    encPass += doubleEVC[j + keyAr[i]];
                }
            }
        }
        
        return new EnigmaEntity(encPass, key);  
    }
    
    private String buildNewKey(String input, int outputLength) throws EnigmaException {
        //Get Valid Characters Array ------------------------------
        int maxEVC = evc.getQuantEVC();
        int evcAr = rand.nextInt(maxEVC) + 1;
        String[] myEVC = evc.getEVC(evcAr);
        
        //Build new key from myEVC --------------------------------
        int max = myEVC.length - 1;
        int min = 0;
        String newKey = "";
        for (int i = 0; i < outputLength; i++) {
            int arIndex = rand.nextInt((max - min) + 1) + min;
            newKey += Integer.toString(arIndex) + DELIMITER;
        }
        
        //To key, add original length and EVC version -------------
        newKey += Integer.toString(input.length()) + DELIMITER;
        newKey += Integer.toString(evcAr);
        
        //Return new key ------------------------------------------
        return newKey;
    }
    
    private String decrypt(EnigmaEntity ee) throws EnigmaException {
        //Establish necessary components -------------------------
        String enc = ee.getEncryptedPass();
        String key = ee.getKey();
        int[] keyAr = dissectKey(key);
        String[] singleEVC = evc.getEVC(keyAr[keyAr.length - 1]);
        String[] doubleEVC = doubleEVC(singleEVC);
        String dec = "";
        
        //Decrypt to MAX_LENGTH ----------------------------------
        for (int i = 0; i < enc.length(); i++) {
            String sub = enc.substring(i, i+1);
            for (int j = 0; j < doubleEVC.length; j++) {
                if (sub.equals(doubleEVC[j])) {
                    int originalIndex = j - keyAr[i];
                    if (originalIndex >= 0 && originalIndex <= singleEVC.length - 1) {
                        dec += singleEVC[originalIndex];
                        break;
                    }
                }
            }
        }
        
        //Decrypt to original length -----------------------------
        return dec.substring(0, keyAr[keyAr.length - 2]);        
    }
    
    private int[] dissectKey(String key) throws EnigmaException {
        try {
            String[] strAr = key.split(DELIMITER);
            int[] intAr = new int[strAr.length];
            
            for (int i = 0; i < strAr.length; i++) {
                intAr[i] = Integer.parseInt(strAr[i]);
            }
            
            return intAr;
        } catch (Exception e) {
            throw new EnigmaException("Invalid Key.");
        }
    }
    
    private String[] doubleEVC(String[] myEVC) throws EnigmaException {        
        //Declare new String array that is double the original length
        int len = myEVC.length;
        String[] doubled = new String[len * 2];
        
        //Build and then return new array
        for (int j = 0; j < (len * 2); j++) {
            if (j < len) {
                doubled[j] = myEVC[j];
            } else {
                doubled[j] = myEVC[j - len];
            }
        }
        return doubled;
    }
    
    private String growInput(String input, int outputLength) {
        int len = input.length();
        while (len < outputLength) {
            if (len < (outputLength / 2)) {
                input += input;
            } else {
                input += input.substring(0, outputLength - len);
            }
            len = input.length();
        }
        return input;
    }

    
    private void validateInput(String input, int minInputLength, int maxInputLength) throws EnigmaException {    
        //Validate length
        if (input.length() < minInputLength) {
            String msg = "Password must be at least " + minInputLength + " characters long.";
            throw new EnigmaException(msg);
        } else if (input.length() > maxInputLength) {
            String msg = "Password must be no more than " + maxInputLength + " characters long.";
            throw new EnigmaException(msg);
        }        
        
        //Validate characters
        for (int i = 0; i < input.length(); i++) {
            String sub = input.substring(i, i+1);
            boolean isMatched = false;
            for (String validChar : evc.getEVC(1)) {
                if (sub.equals(validChar)) {
                    isMatched = true;
                    break;
                }
            }
            if (isMatched == false) {
                String msg = "Password must contain only ASCII characters."
                        + "The character " + sub + " is not allowed.";
                throw new EnigmaException(msg);
            }
        }
    }
    
}