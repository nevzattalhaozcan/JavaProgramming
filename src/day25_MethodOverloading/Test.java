package day25_MethodOverloading;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        System.out.println("sadfasdfads");

        int[] arr = {1,2,3};

        main(arr);

    }

    public static void main(int[] args){

        System.out.println(Arrays.toString(args));

    }


}
