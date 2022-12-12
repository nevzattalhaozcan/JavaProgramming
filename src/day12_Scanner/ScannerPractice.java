package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Please type a number between 1 and 7");

    int day = scan.nextInt();

    String result = "";

    if(day >=1 && day <= 7){

       result = (day == 1)? "Monday" :(day == 2)? "Tuesday" :(day == 3)? "Wednesday"
               :(day == 4)? "Thursday" :(day ==5)? "Friday" :(day == 6)? "Saturda" : "Sunday";

    }else{
        result = "Invalid Number";
    }
        System.out.println(result);

    scan.close();






    }

}
