package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        double total = 0;

        for(int i = 15; i < 25; i++){

            total+=i;

        }
        System.out.println(total);

        System.out.println("--------------------------------------");


        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i < 5; i++ ){

            System.out.print("Enter a number: ");

            sum += scan.nextInt();

        }

        System.out.println(sum);


        scan.close();



    }
}
