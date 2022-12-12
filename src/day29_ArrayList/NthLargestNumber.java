package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,9,3,34,5,33,7,2,9)); // 1, 2, 3, 5, 7, 9, 9, 33, 34

        for (int i = 0; i < 4; i++) {
            list.remove(Collections.max(list));
        }

        System.out.println(Collections.max(list));

    }
}
