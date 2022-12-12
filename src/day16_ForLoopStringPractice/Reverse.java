package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        for(int i = str.length()-1; i>=0; i--){

            System.out.print(""+str.charAt(i));

        }

    }

}
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */