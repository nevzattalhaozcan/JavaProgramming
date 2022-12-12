package day22_MultiDimensionalArray;

public class WarmupTask1_ReverseSentence {

    public static void main(String[] args) {

        String str = "Today is a good day to learn Java";

        String[] arr = str.split(" ");

        for (int i = arr.length-1; i >= 0 ; i--) {

            System.out.print(arr[i] + " ");

        }

    }
}
