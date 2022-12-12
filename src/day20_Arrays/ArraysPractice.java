package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {

    public static void main(String[] args) {

//        numbers (we know them)

        int[] numbers = {12, 44, 59, 32};

        System.out.println(Arrays.toString(numbers));

//         scores (we know the number of them)

        int[] scores = new int[4];
        scores[0] = 10;
        scores[1] = 20;

        System.out.println(Arrays.toString(scores));

//        months

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        if(n>=0 && n<=11){

            System.out.println(months[n]);

        }



    }
}
