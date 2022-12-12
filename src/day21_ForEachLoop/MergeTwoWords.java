package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoWords {

    public static void main(String[] args) {

        String[] group1 = {"Dickens","Twain","James"};
        String[] group2 = {"Tolstoy","Hugo","Balzac","Dumas","Coelho"};

        String[] students = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) {

            students[i++] = each;

        }
        for (String each : group2) {

            students[i++] = each;

        }

        System.out.println(Arrays.toString(students));

        System.out.println("-----------------------------------------------------------------");

        char[] ch1 = {'a', 'b', 'c'};
        char[] ch2 = {'d','e','f'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char c : ch1) {
            chars[j++] = c;
        }

        for (char c : ch2) {
            chars[j++] = c;
        }

        System.out.println(Arrays.toString(chars));

    }
}
