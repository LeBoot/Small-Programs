/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigmadevv2;

import bl.enigmadevv2.enigma.Enigma;
import bl.enigmadevv2.enigma.EnigmaEntity;
import bl.enigmadevv2.enigma.EnigmaException;
import bl.enigmadevv2.enigma.EnigmaImpl;
import bl.enigmadevv2.enigma.EnigmaVC;
import java.util.Scanner;

/**
 *
 * @author Boone
 */
public class App {
    
    public static void main(String[] args) {        
        playEnigma();
//        buildArrays(1, 69);
    }
    
    public static void buildArrays(int startAt, int endAt) {
        EnigmaVC evc = new EnigmaVC();
        evc.buildAndPrintArray(startAt, endAt);
        System.out.println("");
        evc.buildAndPrintSwitch(startAt, endAt);
    }
    
    public static void playEnigma() {
        Enigma enigma = new EnigmaImpl();
        Scanner sc = new Scanner(System.in);
          
        while (true) {
            System.out.println("What is your password? ");
            String input = sc.nextLine();
            try {
                EnigmaEntity ee = enigma.encryptPassword(input);
                System.out.println("Your input: " + input);
                System.out.println("Encrytped password: " + ee.getEncryptedPass());
                System.out.println("Key: " + ee.getKey());
            } catch (EnigmaException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
            System.out.println("");
            System.out.println("Play Again? (Type 'n' to leave)");
            String playAgain = sc.nextLine();
            if (playAgain.startsWith("n")) {
                System.exit(0);
            }         
        }
    }
    
}
