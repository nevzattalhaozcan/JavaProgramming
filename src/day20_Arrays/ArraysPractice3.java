package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // how many num
        System.out.println("How many numbers do you want to enter?");
        int length = new Scanner(System.in).nextInt();

        // precondition
        if(length < 0) {
            System.out.println("Invalid");
            System.exit(0);
        }

        // array declare
        int[] numbers = new int[length];

        // for loop to assign
        for (int i = 0; i < length; i++) {

            System.out.println("Enter a number");
//            int n = scanner.nextInt();

            numbers[i] = scanner.nextInt();            //n;
        }

        // print
        System.out.println(Arrays.toString(numbers));
        scanner.close();

    }
}
