package day17_WhileDoWhile;

import java.util.Scanner;

public class Marry {

    public static void main(String[] args) {

        System.out.println("Will you marry me?");
        String answer = new Scanner(System.in).next();

        while( !(answer.equals("yes") || answer.equals("no")) ){

            System.err.println("Invalid answer, please re-enter");
            answer = new Scanner(System.in).next();

        }

        if(answer.equals("yes")){

            System.out.println("Congrats.");

        }else{

            System.out.println("Goodbye");

        }


    }
}
