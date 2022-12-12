package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmupTasks {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        System.out.println(list);

        System.out.println(swap(list,1,3));

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(moveZeros(list1));

    }

    public static ArrayList<String> swap(ArrayList<String> list, int i, int j){

        String store = list.get(i);

        list.set(i, list.get(j));

        list.set(j, store);

        return list;
    }

    public static ArrayList<Integer> moveZeros(ArrayList<Integer> list){

        ArrayList<Integer> moved = new ArrayList<>();

        for (Integer each : list) {

            if(each != 0)
                moved.add(each);

        }
        for (Integer each : list) {

            if(each == 0)
                moved.add(each);

        }
        return moved;
    }

    public static void extract(String str){

        ArrayList<Character> digits = new ArrayList<>();


        ArrayList<Character> letters = new ArrayList<>();


        ArrayList<Character> specials = new ArrayList<>();



    }

}
/*

1. write a program that can swap the first and last elements of an ArrayList

2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]

3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}

 */