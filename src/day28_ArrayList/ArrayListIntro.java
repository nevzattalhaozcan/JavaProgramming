package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(11);
        numbers.add(45);
        numbers.add(123);
        numbers.add(99);
        numbers.add(50);

        numbers.add(0,100);

        System.out.println(numbers.size());

        System.out.println(numbers);

        System.out.println(numbers.get(0));

        numbers.set(0,0);

        System.out.println(numbers);

        numbers.remove(3);

        System.out.println(numbers);
        Integer a = 50;
        numbers.remove(a);

        System.out.println(numbers);

        numbers.clear();

        System.out.println(numbers);

    }
}
