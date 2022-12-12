package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {
   // My solution is below.

//        System.out.print("Enter your first name: ");
//        String firstName = new Scanner(System.in).next();
//
//        System.out.print("Enter your last name: ");
//        String lastName = new Scanner(System.in).next();
//
//        String firstLetter1 = firstName.substring(0,1);
//        firstLetter1 = firstLetter1.toUpperCase();
//
//        String restOfName = firstName.substring(1);
//        restOfName = restOfName.toLowerCase();
//
//        String firstLetter2 = lastName.substring(0,1);
//        firstLetter2 = firstLetter2.toUpperCase();
//
//        String restOfLastName = lastName.substring(1);
//        restOfLastName = restOfLastName.toLowerCase();
//
//        System.out.println(firstLetter1+restOfName+" "+firstLetter2+restOfLastName);

        System.out.print("Enter your first name: ");
        String firstName = new Scanner(System.in).next();

        System.out.print("Enter your last name: ");
        String lastName = new Scanner(System.in).next();

// This is Muhtar's first solution. Mine is above.
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

     // firstName = ( "" + firstName.charAt(0) ).toUpperCase() + firstName.substring(1).toLowerCase();
     // This is Muhtar's second solution.

        System.out.println(firstName+" "+lastName);

    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format
 (first character in upper case)
                    input:
                        firstName = "cyDEo";
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
 */