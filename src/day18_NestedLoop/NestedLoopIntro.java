package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopIntro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        while(true){

            System.out.println("Enter first number");
            int n1 = scanner.nextInt();

            System.out.println("Enter second number");
            int n2 = scanner.nextInt();

            int result = n1 + n2;

            System.out.println("Addition: " + result);

            System.out.println("Would you like to continue");
            String answer = scanner.next();

            while( !(answer.equals("yes")||answer.equals("no")) ){
                System.out.println("Invalid");

                System.out.println("Would you like to continue");
                answer = scanner.next();
            }

            if(answer.equals("no")){
                break;
            }

        }



    }
}
