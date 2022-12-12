package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(10);
        integers.add(10);
        integers.add(20);
        integers.add(20);
        integers.add(20);
        integers.add(30);
        integers.add(30);
        integers.add(30);

        System.out.println(integers);

        ArrayList<Integer> removed = new ArrayList<>();

        for (Integer each : integers) {

            if(removed.contains(each))
                continue;

            removed.add(each);

        }

        System.out.println(removed);

    }
}
