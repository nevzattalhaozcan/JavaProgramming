package day41_Exceptions;

import java.util.Arrays;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test 1 started");

        try{

            System.out.println( 9 / 0 );
            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");
            System.out.println("ArithmeticException was occurred");

        }

        System.out.println("--------------TEST - 1 FINISHED-----------------");

        System.out.println("Test 2 started");

        try {
            System.out.println("Cydeo".substring(2,0));
        }catch (RuntimeException e){
//            e.printStackTrace();
            e.getMessage();
        }

        System.out.println("--------------TEST - 2 FINISHED-----------------");

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------------------------");



    }
}
