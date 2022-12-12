package day17_WhileDoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        while( !(age>=1 && age<=120) ){

            System.err.println("Invalid age. Enter an age between 1 and 120.");
            age = scanner.nextInt();

        }

        System.out.println("Are you US citizen? (yes/no)");
        String citizen = scanner.next();

        while( !(citizen.equals("yes") || citizen.equals("no")) ){

            System.err.println("Invalid answer. Please type only yes or no.");
            citizen = scanner.next();

        }

        if(age>=18 && citizen.equals("yes")){

            System.out.println("You are eligible to vote");

        }else {

            System.out.println("You are not eligible to vote");

        }


    }
}
