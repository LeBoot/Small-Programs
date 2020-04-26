/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.InterviewPrograms;

/**
 *
 * @author Boone
 */
public class Fibonacci {
    
    public static void runFibonacci(int maxNum) {
        if (maxNum > 45) {
            System.out.println("Sorry, but I can't go above 45.");
            maxNum = 45;
        }
        
        int[] sequence = new int[maxNum];
        sequence[0] = 1;
        sequence[1] = 1;
        
        System.out.println("1: " + sequence[0]);
        System.out.println("2: " + sequence[1]);
        
        for (int i = 2; i < maxNum; i++) {
            sequence[i] = sequence[i - 2] + sequence[i - 1];
            System.out.println((i + 1) + ": " + sequence[i]);
        }
    }
    
}
