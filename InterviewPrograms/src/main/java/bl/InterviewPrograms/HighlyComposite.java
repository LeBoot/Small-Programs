/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.InterviewPrograms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Boone
 */
public class HighlyComposite {
    
    public static void runHighlyComposite(int maxNum) {
        List<Integer> listOfFactors;
        int highestComposite = 0;
        
        for (int i = 0; i <= maxNum; i++) {
            listOfFactors = factorize(i);
            if (listOfFactors.size() > highestComposite) {
                highestComposite = listOfFactors.size();
                System.out.println(i + ": " + listOfFactors.toString());
            }
        }
    }
    
    private static List<Integer> factorize(int num) {
        List<Integer> listOfFactors = new ArrayList<>();
        
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                listOfFactors.add(i);
            }
        }
        
        return listOfFactors;
    }
}
