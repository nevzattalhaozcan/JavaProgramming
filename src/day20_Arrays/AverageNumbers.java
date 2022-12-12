package day20_Arrays;

public class AverageNumbers {

    public static void main(String[] args) {

//        numbers
        int[] numbers = {3, 2, 1, 4, 2};

//        sum //        for
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

//        average
        int average = sum / numbers.length;

//        print
        System.out.println(average);

    }
}
