/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.fibonaccisequence;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Boone
 */
public class Fib {
    
    static Scanner sc = new Scanner(System.in);
    
    //MAIN ---------------------------------------------------------------------
    public static void main(String[] args) {
        boolean keepPlaying = true;
        
        System.out.println("Welcome to the Fibonacci Sequence game.");
                
        do {
            int userChoice = askOptions();
            
            switch (userChoice) {
                case 1:
                    listNValues();
                    break;
                case 2:
                    addNValues();
                    break;
                default:
                    keepPlaying = false;
                    break;
            }
        } while(keepPlaying);
        
        System.out.println("");
        System.out.println("Goodbye");
        
    }
    
    //OTHER --------------------------------------------------------------------
    public static void addNValues() {
        System.out.println("How many positions would you like to sum?");
        int[] fibSequence = listSequence(Integer.parseInt(sc.nextLine()));
        
        int sum = 0;
        for (int term : fibSequence) {
            sum += term;
        }
        
        System.out.println("Sum: " + sum);
    }
    
    public static void listNValues() {
        System.out.println("How many positions would you like listed?");
        System.out.println(Arrays.toString(listSequence(Integer.parseInt(sc.nextLine()))));
    }
    
    public static int askOptions() {
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("1) List n values.");
        System.out.println("2) Add n value.");
        System.out.println("3) Exit.");
        return Integer.parseInt(sc.nextLine());
    }
    
    public static int[] listSequence(int numPositions) {
        int[] fibSequence = new int[numPositions];
        fibSequence[0] = 1;
        fibSequence[1] = 1;
        
        for (int i = 2; i < numPositions; i++) {
            fibSequence[i] = fibSequence[i - 2] + fibSequence[i - 1];
        }
        
        return fibSequence;
    }
    
}
