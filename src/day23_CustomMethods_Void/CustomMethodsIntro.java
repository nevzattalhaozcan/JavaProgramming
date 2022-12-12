package day23_CustomMethods_Void;

import java.util.Scanner;

public class CustomMethodsIntro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Start");

        a(true);

        String v = "asfasf";



        a(scanner.nextBoolean());

        System.out.println("Test Finish");

    }

    public static void a(boolean word){

        System.out.println(word);
        System.out.println("parametre " + word);

    }

}

//        System.out.println("Test Started");
//
//        greeting();
//
//        System.out.println("Test Completed");

//    public static void greeting(){
//
//        System.out.println("Hello World!");
//        System.out.println("How are you today?");
//    }