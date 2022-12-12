package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        //      max int =  2147483647
       Scanner scan = new Scanner(System.in);

        int min = 2147483647;

        for(int i = 0; i < 5; i++){

            System.out.print("Enter a number: ");
            int number = scan.nextInt();

            if(number < min){

                min = number;

            }

        }
        System.out.println("Minimum Number: " + min);




    }
}
/*
Write a program that asks the user to enter a number for 5 times.
return the minimum number
 */