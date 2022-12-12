package day21_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int[] numbers = {10,23,45,12,76,2};

        double sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        double average = sum/numbers.length;

        System.out.println(average);

    }
}
