package day29_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 7,6,5,4,3,2,1));

        Collections.sort(list);

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);

        Collections.swap(list, 1,8);

        System.out.println(list);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2,2,1,1,1,1));

        Collections.replaceAll(list1, 2,0);

        System.out.println(list1);

        int frequencyOf1 = Collections.frequency(list1,1);

        System.out.println("frequencyOf1 = " + frequencyOf1);

    }
}

/*
*
* //    sort()
//      reverse()
//      swap()
//      max()
*       min()
*       replaceAll()
*       frequency()
*
* */
