/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.InterviewPrograms;

import java.util.Scanner;

/**
 *
 * @author Boone
 */
public class App {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int whichGame = askWhichGame();
        int maxNum = askMaxNum();
        play(whichGame, maxNum);
    }
    
    private static int askWhichGame() {
        System.out.println("Which game would you like to play?");
        System.out.println("1) BuzzFizz");
        System.out.println("2) Factorizer");
        System.out.println("3) Highly Composite");
        System.out.println("4) Fibonacci Sequence");
        return Integer.parseInt(sc.nextLine());
    }
    
    private static int askMaxNum() {
        System.out.println("What is the maximum number to query?");
        return Integer.parseInt(sc.nextLine()); 
    }
    
    private static void play(int whichGame, int maxNum) {
        switch (whichGame) {
            case 1:
                BuzzFizz.runBuzzFizz(maxNum);
                break;
            case 2:
                Factorizer.runFactorizer(maxNum);
                break;
            case 3:
                HighlyComposite.runHighlyComposite(maxNum);
                break;
            case 4:
                Fibonacci.runFibonacci(maxNum);
                break;
            default:
                System.out.println("That wasn't an option.  Bye bye.");
                break;
        }        
    }
    
}
