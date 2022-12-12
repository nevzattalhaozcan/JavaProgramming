package day17_WhileDoWhile;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        for (char i = 'a'; i < 'z'; i++) {

            if(i == 'g'){

                break;

            }

            System.out.print(i + " ");

        }


        System.out.println();
        System.out.println("-----------------------");

        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        if(n > 0) {
            while (true) {

                System.out.println("You cannot exit till typing a negative number");
                n = new Scanner(System.in).nextInt();

                if (n < 0) {

                    break;

                }

            }

        }
    }

}
