package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        Integer a = 100;

        System.out.println(numbers);

        boolean r1 = numbers.remove(a);

        System.out.println(numbers);

        System.out.println(r1);

        numbers.clear();

        System.out.println(numbers);

        System.out.println("--------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(300);
        list.add(400);
        list.add(500);

        for (int i = 0; i < list.size(); i++) {

            if(i == 2) continue;

            list.remove(i);

        }

        System.out.println(list); // output: [300, 500] removeIf should be used

        System.out.println("--------------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int first = characters.indexOf('A');

        int last = characters.lastIndexOf('A');

        System.out.println("first = " + first);
        System.out.println("last = " + last);

        System.out.println("----------------------------------");

        boolean r2 = characters.contains('A');

        System.out.println("r2 = " + r2);

        boolean r3 = characters.contains('Z');

        System.out.println("r3 = " + r3);

        System.out.println("----------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(20);
        list2.add(30);

        System.out.println(list1.equals(list2));

        System.out.println("----------------------------------");

        list2.clear();

        System.out.println(list2.isEmpty());

        System.out.println(list1.isEmpty());

        System.out.println("----------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();

        // Bulk Operation
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list3);

    }
}
