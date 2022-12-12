package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String[] students = {"Huxley", "Darwin", "Spencer", "Hugo", "Freud", "Tolstoy", "Dostoyevski"};

        System.out.println(Arrays.toString(students));

        String[] earlyBirds = Arrays.copyOf(students,3);
//      String[] earlyBirds = Arrays.copyOf(students,30);
//      String[] earlyBirds = Arrays.copyOf(students,students.length);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(numbers));

        numbers = Arrays.copyOf(numbers,3);

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        char[] ch2 = Arrays.copyOfRange(ch1,2,5);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        System.out.println("-------------------------------------------------");

        int[] n = {12,23,34,45,56,67,78,89,90};

        int[] nn = Arrays.copyOfRange(n,3,6);

        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(nn));


    }
}
