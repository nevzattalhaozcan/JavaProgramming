package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        System.out.println(numbers); // hashcode

        System.out.println(Arrays.toString(numbers));

        int[] scores = {56,67,99,45,98,76};

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        System.out.println("Max: " + scores[0]);
        System.out.println("Min: " + scores[scores.length-1]);

        String[] names = {"Nietzche", "Heidegger", "Kafka", "Wittgenstein"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------------------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);

        System.out.println(r2);

        System.out.println("-------------------------------------------------");

        char[] ch1 = {'a','c','d'}; //
        char[] ch2 = {'d','a','c'};

        Arrays.sort(ch1); // when we compare two string to check if they are angram ******
        Arrays.sort(ch2); // first we convert each character to char and sort and equals *******

        boolean anagram = Arrays.equals(arr1,arr2);

        System.out.println(anagram);



    }
}
