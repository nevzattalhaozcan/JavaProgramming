package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list);

        list.removeAll(Arrays.asList(1,2,3));

        System.out.println(list);

        list.retainAll(Arrays.asList(6,7,8,9));

        System.out.println(list);

        System.out.println(list.containsAll(Arrays.asList(7, 8)));

    }
}
