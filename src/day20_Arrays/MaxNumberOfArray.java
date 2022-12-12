package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

//      numbers and max
        int[] numbers = {1, 2, 3, 4, 5};
        int max = numbers[0];

//      for loop to check
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){

                max = numbers[i];

            }

        }

//      print
        System.out.println(max);

    }
}
