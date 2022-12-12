package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Metamorphosis of Narcissos";

        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        for (char each : ch) {
            System.out.println(each);
        }

        System.out.println("------------------------------");

        String s = "Wooden Spoon";

        String[] words = s.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------");

        String word = "ABC";

        String[] letters = word.split("");

        System.out.println(Arrays.toString(letters));

        System.out.println("----------------------------");

        String sentences = "Today is Tuesday. I like reading Nietzche. Brave New World is an awesome book";

        String[] sent = sentences.split("\\. "); // if you use . in split method, you should type \\ before it. ***

//        System.out.println(Arrays.toString(sentences.split("\\. ")));

        System.out.println(Arrays.toString(sent));

    }
}
