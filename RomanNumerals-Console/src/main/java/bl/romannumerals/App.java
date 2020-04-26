/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.romannumerals;

import bl.romannumerals.RN.RomanNumeral;

/**
 *
 * @author Boone
 */
public class App {
    
    public static void main(String[] args) {
        
        RomanNumeral rn = new RomanNumeral();
        
        rn.greetUser();
        while (true) {
            int choice = rn.askChoice();
            switch (choice) {
                case 1:
                    rn.romanToArabic();
                    break;
                case 2:
                    rn.arabicToRoman();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    
}
