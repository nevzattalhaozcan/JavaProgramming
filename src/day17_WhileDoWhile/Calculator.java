package day17_WhileDoWhile;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        System.out.println("Enter your operator");
        char operator = scan.next().charAt(0);

        while( !(operator == '+' || operator == '-') ){ // If operator is not + or - , the code fragment below will get executed.
                                                        // This message occurs till we make the condition is false (by entering matching operator)
            System.err.println("Invalid Operator. Please re-enter your operator.");
            operator = scan.next().charAt(0);

        }
        // This statement won't get executed till the while loop exits.
        System.out.println( (operator == '+')? num1 + num2 : num1 - num2 );

    }
}
