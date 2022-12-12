package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl", uniques = "";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (String each : list) {

            int freq = Collections.frequency(list,each);

            if(freq == 1){

                uniques += each;

            }

        }

        System.out.println(uniques);

    }
}
