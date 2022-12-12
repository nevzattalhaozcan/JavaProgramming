package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram { // INTERVIEW TASK

    public static void main(String[] args) {

        String str1 = "adbc", str2 = "eacb";

        char[] chS1 = str1.toCharArray(); // a,b,c,d

        char[] chS2 = str2.toCharArray(); // a,b,c,e

        Arrays.sort(chS1);
        Arrays.sort(chS2);

        System.out.println("Is anagram? " + Arrays.equals(chS1,chS2));


    }
}
