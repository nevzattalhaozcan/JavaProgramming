package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        String[] names = new String[5];

        int[] numbers;
        numbers = new int[5];

        double floating[];
        floating = new double[5];

        //System.out.println(names); it gives hashcode

        System.out.println(Arrays.toString(names));
        // [null, null, null, null, null]
        //   0      1     2     3     4

        names[2] = "Samsung";

        System.out.println(Arrays.toString(names));

        System.out.println(names[2]);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(floating));

        System.out.println("--------------------------------------------");

        String[] myList = {"A", "B", "C"};

        System.out.println(myList[1]);



    }
}
