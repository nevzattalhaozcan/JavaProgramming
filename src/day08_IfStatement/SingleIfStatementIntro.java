package day08_IfStatement;

import java.util.concurrent.locks.Condition;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 3001;
        boolean evenNumber = number % 2 == 0;

        if(evenNumber){

            System.out.println(number + " is even number");

        }
        if(!evenNumber){
            System.out.println(number + " is odd number");
        }
    }
}
