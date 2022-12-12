package day21_ForEachLoop;

public class MaxMinNumber {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int max = numbers[0];


        for (int number : numbers) {

            if(number > max){

                max = number;
            }

        }

        System.out.println(max);

        System.out.println("-----------------------");

        int[] numbers2 = {4,5,6,7,8,9,1};
        int min = numbers2[0];

        for (int i : numbers2) {

            if(i < min){
                min = i;
            }

        }

        System.out.println(min);

    }
}
