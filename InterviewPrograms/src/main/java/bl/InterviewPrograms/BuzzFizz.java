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
public class BuzzFizz {
    public static void runBuzzFizz(int maxNum) {
        for (int i = 1; i <= maxNum; i++) {
            String printMe;
            
            if ((i%3 == 0) && (i%5 == 0)) {
                printMe = "BuzzFizz";
            }
            else if (i%3 == 0) {
                printMe = "Buzz";
            }
            else if (i%5 == 0) {
                printMe = "Fizz";
            }
            else {
                printMe = "";
            }
            
            System.out.println(i + ": " + printMe);
        }
    }
}
