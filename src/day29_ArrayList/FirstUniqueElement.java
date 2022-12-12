package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,1,2,3,3,4,5,5,5));

        for (Integer each : list) {

            int count = 0;

            for (Integer num : list) {

                if(each == num)
                    count++;

            }

            if(count == 1){
                System.out.println(each);
                break;
            }

        }

    }
}

//1. Write a program that can return the first unique elements from an arraylist
//
//			Do not use indexOf & lastIndexOf methods