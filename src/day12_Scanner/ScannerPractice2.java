package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("3 + 3 = 6");
        System.out.println("Type true or false:");

        String result = "";
        boolean result1 = input.nextBoolean();


        if(result1 == true){
            result = "Congratulations!";
        }else{
            result = "Failed.";
        }

        System.out.println();

        System.out.println("Please enter your first name");
        String name = input.next();

        System.out.println();

        if (result == "Congratulations!") {
            System.out.println("You did great " + name);
        }else{
            System.out.println("You should study more " + name);
        }


        input.close();


    }
}
