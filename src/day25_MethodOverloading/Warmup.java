package day25_MethodOverloading;

import java.util.Arrays;

public class Warmup {

    public static void main(String[] args) {

        int[] array = {1,2,3,4};

        System.out.println(Arrays.toString(add(array,5)));

        String[] arr = {"a","b","c","d"};

        System.out.println(Arrays.toString(words(arr,"e")));

    }
    public static int[] add(int[] array, int element){

        array = Arrays.copyOf(array,array.length+1);

        array[array.length-1] = element;

        return array;

    }

    public static String[] words(String[] arr, String str){

        arr = Arrays.copyOf(arr,arr.length+1);

        arr[arr.length-1] = "e";

        return arr;

    }

}
