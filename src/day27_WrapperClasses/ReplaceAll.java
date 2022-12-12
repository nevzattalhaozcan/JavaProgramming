package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] array = {1,2,3,3,3,5,6,7};

        replaceAll(array,3,0);

        System.out.println(Arrays.toString(array));

    }

    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue)
                array[i] = newValue;

        }

        return array;

    }

}
