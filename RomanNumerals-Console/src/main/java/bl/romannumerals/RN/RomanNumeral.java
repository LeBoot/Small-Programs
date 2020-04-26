/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.romannumerals.RN;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Boone
 */
public class RomanNumeral {
    
    Scanner sc = new Scanner(System.in);
    
    public void greetUser() {
        System.out.println("======= Welcome to the Roman Numeral game! =======");
    }
    
    public int askChoice() {
        String error = "Please select either 1, 2, or 3.";
        boolean isValid;
        int choice = -1;
        
        do {
            isValid = true;
            printOptions();
            try {
                choice = Integer.parseInt(sc.nextLine());
                if ((choice < 1) || (choice > 3)) {
                    isValid = printError(error);
                }
            } catch (NumberFormatException ex) {
                isValid = printError(error);
            }
        } while (!isValid);
        
        return choice;
    }
    
    private void printOptions() {
        System.out.println("");
        System.out.println("To convert from Roman to Arabic, enter 1.");
        System.out.println("To convert from Arabic to Roman, enter 2.");
        System.out.println("To exit, enter 3.");
    }
    
    private boolean printError(String error) {
        System.out.println(error);
        System.out.println("");
        return false;
    }
    
    //ROMAN TO ARABIC ==========================================================
    //==========================================================================
    
    public void romanToArabic() {
        String input = getInputRomanToArabic();
        int arabicNumeral = convertRomanToArabic(input);
        System.out.println("Input: " + input + ".  Result: " + arabicNumeral + ".");
    }
    
    private String getInputRomanToArabic() {
        boolean isValid;
        String input;
        
        do {
            System.out.println("Enter a Roman numeral: ");
            input = sc.nextLine();
            isValid = validateRomanNumeral(input);
        } while (!isValid);
        
        return input;
    }
    
    public boolean validateRomanNumeral(String input) {
        String p2 = "[M]{0,5}+(CM)?+(CD)?+[D]?+(XC)?+[C]{0,3}+(XL){0,3}+L?+(IX)?+[X]{0,3}+(IV)?+[V]?+[I]{0,3}";
        return Pattern.matches(p2, input.toUpperCase());
    }
    
    public int convertRomanToArabic(String RomanNumeral) {
        String rn = RomanNumeral.toUpperCase();
        int arabic = 0;
        
        if (rn.contains("CM")) {
            arabic += 900;
            rn = rn.replace("CM", "");
        }
        while (rn.contains("M")) {
            arabic += 1000;
            rn = removeByIndex(rn, rn.indexOf("M"));            
        }
        if (rn.contains("CD")) {
            arabic += 400;
            rn = rn.replace("CD", "");
        }
        if (rn.contains("D")) {
            arabic += 500;
            rn = rn.replace("D", "");
        }
        if (rn.contains("XC")) {
            arabic += 90;
            rn = rn.replace("XC", "");
        }
        while (rn.contains("C")) {
            arabic += 100;
            rn = removeByIndex(rn, rn.indexOf("C"));
        }
        if (rn.contains("XL")) {
            arabic += 40;
            rn = rn.replace("XL", "");
        }
        if (rn.contains("L")) {
            arabic += 50;
            rn = rn.replace("L", "");
        }
        if (rn.contains("IX")) {
            arabic += 9;
            rn = rn.replace("IX", "");
        }
        while (rn.contains("X")) {
            arabic += 10;
            rn = removeByIndex(rn, rn.indexOf("X"));
        }
        if (rn.contains("IV")) {
            arabic += 4;
            rn = rn.replace("IV", "");
        }
        if (rn.contains("V")) {
            arabic += 5;
            rn = rn.replace("V", "");
        }
        while (rn.contains("I")) {
            arabic += 1;
            rn = removeByIndex(rn, rn.indexOf("I"));
        }
        
        return arabic;
    }
    
    private static String removeByIndex(String str, int index) {
        return new StringBuilder(str).deleteCharAt(index).toString();
    }
    
    
    //ARABIC TO ROMAN ==========================================================
    //==========================================================================
    
    public void arabicToRoman() {
        int input = getInputArabicToRoman();
        String romanNumeral = convertArabicToRoman(input);
        System.out.println("Input: " + input + ".  Result: " + romanNumeral + ".");
    }
    
    private int getInputArabicToRoman() {
        String error = "Enter an integer less than 5000.";
        boolean isValid;
        int choice = -1;
        
        do {
            isValid = true;
            System.out.println("What number would you like to convert? ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                if ((choice < 1) || (choice > 5000)) {
                    isValid = printError(error);
                }
            } catch (NumberFormatException ex) {
                isValid = printError(error);
            }
        } while (!isValid);
        
        return choice;
    }
    
    public String convertArabicToRoman(int arabic) {
        String output = "";
        while ((arabic - 1000) >= 0) {
            output += "M";
            arabic -= 1000;
        }
        if ((arabic - 900) >= 0) {
            output += "CM";
            arabic -= 900;
        }
        if ((arabic - 500) >= 0) {
            output += "D";
            arabic -= 500;
        }
        if ((arabic - 400) >= 0) {
            output += "CD";
            arabic -= 400;
        }
        while ((arabic - 100) >= 0) {
            output += "C";
            arabic -= 100;
        }
        if ((arabic - 90) >= 0) {
            output += "XC";
            arabic -= 90;
        }
        if ((arabic - 50) >= 0) {
            output += "L";
            arabic -= 50;
        }
        if ((arabic - 40) >= 0) {
            output += "XL";
            arabic -= 40;
        }
        while ((arabic - 10) >= 0) {
            output += "X";
            arabic -= 10;
        }
        if ((arabic - 9) >= 0) {
            output += "IX";
            arabic -= 9;
        }
        if ((arabic - 5) >= 0) {
            output += "V";
            arabic -= 5;
        }
        if ((arabic - 4) >= 0) {
            output += "IV";
            arabic -= 4;
        }
        while ((arabic - 1) >= 0) {
            output += "I";
            arabic -= 1;
        }
        return output;
    }
}
