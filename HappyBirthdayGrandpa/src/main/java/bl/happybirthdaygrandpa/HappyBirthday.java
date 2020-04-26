/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.happybirthdaygrandpa;

import java.time.LocalDate;

/**
 *
 * @author Boone
 */
public class HappyBirthday {
    public static void main(String[] args) {
        String part1 = createPart1("Happy Birthday", "Grandpa");
        
        int age = calculateAge("1924-03-12", "2020-03-12");
        
        String part2 = createPart2(age);
        
        String part3 = createPart3("Ben", "Morganna");
        
        printMessage(part1, part2, part3);
    }
    
    public static String createPart1(String greeting, String favoritePerson) {
        String message = greeting + ", " + favoritePerson + "!";
        return message;
    }
    
    public static int calculateAge(String birthdateString, String birthdayString) {
        LocalDate birthdate = LocalDate.parse(birthdateString);
        LocalDate birthday = LocalDate.parse(birthdayString);
        int totalYears = birthdate.until(birthday).getYears();
        return totalYears;
    }
    
    public static String createPart2(int age) {
        String totalYears = Integer.toString(age);
        String part1 = "Wow, you're " + totalYears + " years old...";
        String part2 = "\n";
        
        if (age >= 100) {
            part2 += "Great job on becoming a centenarian!";
        } else if ((age < 100) && (age >= 95)) {
            part2 += "Still as handsome now as you were at 20!";
        } else if ((age < 95) && (age >= 90)) {
            part2 += "Not many people can say that they're a nonagenarian... but you can!";
        } else if ((age < 90) && (age >= 75)) {
            part2 += "Over three quarters of a century and still going strong!";
        } else {
            part2 += "Still just a young whipper snapper!";
        }
        
        return part1 + part2;
    }
    
    public static String createPart3(String name1, String name2) {
        String message = "Love, \n" + name1 + " and " + name2;
        return message;
    }
    
    public static void printMessage(String part1, String part2, String part3) {
        System.out.println(part1);
        System.out.println("");
        System.out.println(part2);
        System.out.println("");
        System.out.println(part3);
    }
}
