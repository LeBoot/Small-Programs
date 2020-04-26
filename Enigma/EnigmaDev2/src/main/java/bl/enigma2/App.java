/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigma2;

import bl.enigma2.security.Enigma;
import bl.enigma2.security.InvalidKeyException;
import bl.enigma2.security.InvalidPasswordException;

/**
 *
 * @author Boone
 */
public class App {
    
    public static void main(String[] args) {
        Enigma enigma = new Enigma();
        
        String input = "ItW0rks!";
        String[] output = new String[2];
        try {
            output = enigma.encryptString(input);
        } catch (InvalidPasswordException | InvalidKeyException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        
        System.out.println("Input: " + input);
        System.out.println("Encrypted String: " + output[0]);
        System.out.println("Key: " + output[1]);
        System.out.println("");
        System.out.println("Running decryption...");
        
        
        try {
            String decrypted = enigma.decryptString(output[0], output[1]);
            System.out.println("Decrypted: " + decrypted);
            String fullyDecrypted = enigma.fullyDecryptString(output[0], output[1]);
            System.out.println("Fully decrypted: " + fullyDecrypted);
        } catch (InvalidKeyException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        
        //
        
        String printMe = "";
        String[] doubled = enigma.doubleValidCharacters();
        for (String s : doubled) {
            printMe += s;
        }
        System.out.println("Double Array of Characters: " + printMe);

    }    
    
}
