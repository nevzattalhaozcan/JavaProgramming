package day23_CustomMethods_Void;

import java.util.Arrays;
import java.util.Scanner;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is even or odd:");

//        oddOrEven(); the method demands additional info to complete its task because it has a parameter

        oddOrEven(scanner.nextInt());

        System.out.println("Enter current year and your birth year:");

        age(scanner.nextInt(),scanner.nextInt());

    }

    public static void oddOrEven(int number){

        if(number % 2 == 0)
            System.out.println(number + " is an even number.");
        else
            System.out.println(number + " is an odd number.");

    }

    public static void age(int currentYear,int birthYear){

        System.out.println("Your age is " + (currentYear-birthYear));

    }

}
