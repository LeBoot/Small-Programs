/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigmapractice.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Boone
 */
public class Practice2 {
    
    /*
    Array of characters to be used when building strings.
    */
    private final String[] CHARACTERS = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
        "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d",
        "e", "f", "g", "h", "i", "j", "k", "m", "n", "o",
        "p", "q", "r", "s", "t", "u", "v", "w", "x", "y",
        "z", "!", "@", "#", "$", "%", "&", "?"
    };
    
    /*
    Desired length of output string.
    Must be an even number.
    */
    private final int LENGTH = 64;
    
    /*
    Random number generator
    */
    Random randGen = new Random();
    
    /*
    Method to encrypt a string.
    Uses several helper methods.
    */
    public String encryptString(String s, int[] k) {        
        try {
            validateInput(s, CHARACTERS);
            s = verifyStringLength(s, LENGTH);
            return buildNewString(s, k);
        } catch (InvalidInputException e) {
            return "failure";
        }
    }
    
    private void validateInput(String s, String[] validStringsArray) throws InvalidInputException {
        List<String> validStringsList = Arrays.asList(validStringsArray);
        char[] inputArray = s.toCharArray();
        for (char c : inputArray) {
            if (!validStringsList.contains(String.valueOf(c))) {
                throw new InvalidInputException("Invalid Character");
            }
        }
    }
    
    private String buildNewString(String s, int[] k) {
        String newString = "";
        
        for (int i = 0; i < k.length; i++) {
            String stringPart = s.substring(i, i + 1);
            for (int j = 0; j < CHARACTERS.length; j++) {
                if (stringPart.equals(CHARACTERS[j])) {
                    stringPart = CHARACTERS[j + k[i]];
                }
            }
        }
        
        return newString;
    }
    
    
    
    /*
    Take a string of any length between 1 and the goal length (inclusively), and
        return a string that is a build from multiple full and/or partial copies
        of that input string until the total length is equal to the goal length.
    This method is public for testing purposes.
    */
    public String verifyStringLength(String s, int goalLength) throws InvalidInputException {
        int l = s.length();
        if ((l > LENGTH) || (l < 1)) {
            throw new InvalidInputException("Invalid Length");
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
