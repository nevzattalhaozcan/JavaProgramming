package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {1,23,34,45,123,65,22};

        for (int i = 0; i < numbers.length; i++) {

            int eachElement = numbers[i];

            System.out.print(eachElement + " ");

        }

        System.out.println();
        System.out.println("-------------------------");

        for (int each : numbers) {

            System.out.print(each + " ");

        }


    }
}
