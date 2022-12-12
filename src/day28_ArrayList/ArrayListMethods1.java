package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.add(1,20);

        System.out.println(numbers);

        System.out.println("---------------------------------");

        System.out.println(numbers.size());

        System.out.println("---------------------------------");

        System.out.println(numbers.get(2));

        for (Integer number : numbers) {

            System.out.println(number);

        }

        System.out.println("---------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Java");
        names.add("Python");
        names.add("C#");
        names.add("Java");
        names.add("Ruby");

        names.set(3,"JavaScript");

        System.out.println(names);

        System.out.println("-----------------------------------");

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C#");
        languages.add("Java");
        languages.add("Ruby");

        System.out.println(languages);

        languages.remove(0);

        System.out.println(languages);

        languages.remove(languages.size()-1);

        System.out.println(languages);

        languages.remove(1);

        System.out.println(languages);

        languages.remove("Java");

        System.out.println(languages);

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(30);
        num.add(40);
        num.add(50);

        Integer a = 10;

        System.out.println(num);

        num.remove(a);

        System.out.println(num);

    }
}
