package day20_Arrays;

import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//         array
        int[] numbers = new int[10];

//        scanner
        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Enter a number");
            numbers[i] = scanner.nextInt();

        }

//        assuming min max
        int max = numbers[0];
        int min = numbers[0];

//        for
//        min max
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] < min)
                min = numbers[i];

            if(numbers[i] > max)
                max = numbers[i];

        }

//        print
        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }
}
