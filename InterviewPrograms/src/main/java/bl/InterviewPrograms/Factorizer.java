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
public class Factorizer {
    
    public static void runFactorizer(int maxNum) {
        for (int i = 1; i <= maxNum; i++) {
            String factors = factorize(i);
            System.out.println(i + ": " + factors);
        }
    }
    
    private static String factorize(int num) {
        
        List<Integer> listOfFactors = new ArrayList<>();
        
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                listOfFactors.add(i);
            }
        }
        
        return listOfFactors.toString();
    }
}
