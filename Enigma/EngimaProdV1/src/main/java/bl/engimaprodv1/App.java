/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.engimaprodv1;

import bl.engimaprodv1.security.Enigma;
import bl.engimaprodv1.security.exception.InvalidKeyException;
import bl.engimaprodv1.security.exception.InvalidPasswordException;
import java.util.Scanner;

/**
 *
 * @author Boone
 */
public class App {
    public static void main(String[] args) {
        playEnigma();        
    }
    
    public static void playEnigma() {
        Enigma enigma = new Enigma();
        Scanner sc = new Scanner(System.in);
        String output[] = new String[2];
        
        boolean isUserInputValid = true;
        do {
            try {
                System.out.println("Please enter a password: ");
                String userInput = sc.nextLine();
                output = enigma.encryptPassword(userInput);
            } catch (InvalidPasswordException | InvalidKeyException ex) {
                isUserInputValid = false;
                System.out.println("Sorry, but your password is too short, "
                        + "too long, or contains invalid characters.  Please try again");
            }
        } while (!isUserInputValid);
        
        System.out.println("");
        System.out.println("Your encrypted password is: " + output[0]);
        System.out.println("Your key is: " + output[1]);
        System.out.println("");
        System.out.println("Enter your password again to see if this program works: ");
        
        String userInput2 = sc.nextLine();
        boolean response = enigma.doesPasswordMatch(userInput2, output[0], output[1]);
        if (response == true) {
            System.out.println("Woohoo!  They match :)");
        } else {
            System.out.println("Uh oh.  Those passwords don't match.");
        }
        
    }
    
}
