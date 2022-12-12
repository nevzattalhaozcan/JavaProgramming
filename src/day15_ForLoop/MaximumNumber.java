package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
//      max int =  2147483647
//      min int = -2147483648

        Scanner scan = new Scanner(System.in); // Since we ask user to type 5 numbers, we should create a Scanner object.

        int max = -2147483648; // This is the minimum number of an int. All numbers the user type will be greater than this.

        for(int i = 0; i < 5; i++){ // This statement only defines how many times our condition repeats.

            System.out.print("Enter a number: ");
            int number = scan.nextInt();

            if(number > max){ // if the number the user write is greater than the max variable we assigned before, the number
                              // will be assigned to max variable. If not, the block doesn't get executed.

                max = number;

            }

        }

        System.out.println("Maximum number is: " + max);

        scan.close();


    }
}
/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number
 */