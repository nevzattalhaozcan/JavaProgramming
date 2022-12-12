package day20_Arrays;

public class MinimumNumberOfArray {

    public static void main(String[] args) {

//        numbers
        int[] numbers = {1, 3, 0, 5, 4};

//        assuming one of them min
        int min = numbers [0];

//        for
        for (int i = 0; i < numbers.length; i++) {

            if( numbers[i] < min ){

                min = numbers[i];

            }

        }

//        print
        System.out.println(min);

    }
}
