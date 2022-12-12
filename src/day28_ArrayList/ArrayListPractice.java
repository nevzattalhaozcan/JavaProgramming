package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

            list.set( i , list.get(i)*2 );

        }

        System.out.println(list);

    }

}
