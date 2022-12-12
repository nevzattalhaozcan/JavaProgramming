package day11_Switch_Scanner;

public class Grade_switch {

    public static void main(String[] args) {

        char grade = 'A';

        switch(grade){

            case 'A':
                System.out.println("excellent");
                break;

            case 'B':
                System.out.println("great job");
                break;

            case 'C':
                System.out.println("good");
                break;

            case 'F':
                System.out.println("failed");
                break;

            default:
                System.out.println("invalid");

        }


    }
}
