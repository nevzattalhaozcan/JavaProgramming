package day17_WhileDoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        System.out.println("Will you marry me? (yes/no)");
        String answer = new Scanner(System.in).next().toLowerCase();

        if(answer.equals("yes") || answer.equals("no")){

            if(answer.equals("yes")){

                System.out.println("Congrats");

            }else {

                System.out.println("Goodbye");

            }

        }else {

            while (!(answer.equals("yes") || answer.equals("no"))) {

                System.out.println("Invalid");
                System.out.println("Will you marry me? (yes/no)");
                answer = new Scanner(System.in).next().toLowerCase();

            }

            if (answer.equals("yes")) {

                System.out.println("Congrats");

            } else {

                System.out.println("Goodbye");

            }
        }
    }
}
