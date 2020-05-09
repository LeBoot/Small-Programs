/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigmapractice;

import bl.enigmapractice.practice2.InvalidInputException;
import bl.enigmapractice.practice2.Practice3;

/**
 *
 * @author Boone
 */
public class Enigma {
    
    public static void main(String[] args) throws InvalidInputException {
        Practice3 aa = new Practice3();
        
        int[] key = aa.generateNewKey();
        String printKey = "";
        int KeyLength = 0;
        for (int n : key) {
            printKey += n;
            KeyLength++;
        }
        System.out.println("Key: " + printKey);
        System.out.println("Key length: " + KeyLength);
        
        String input = "myPassWord!";
        System.out.println("Input: " + input);
        
        String output = aa.encryptString(input, key);
        System.out.println("Output: " + output);
        System.out.println("Output length: " + output.length());
    }
    
    public static int scramble(String input) {
        
        String myList1 = "1234567890xl";
        String myList2 = "abcdefghijkm";
        String myList3 = "nopqrstuvwyz";
        String myList4 = "ABCDEFGHIJKL";
        String myList5 = "MNOPQRSTUVWX";
        String myList6 = "YZ#$";        
        
        String myList0 = myList1 + myList2 + myList3 + myList4 + myList5 + myList6;
        
        int newKey = -1;
        
        for (int i = 0; i < myList0.length(); i++) {
            if (myList0.charAt(i) == input.toCharArray()[0]) {
                newKey = i;
            }
        }
        
        return newKey; 
        
    }
    
}
