package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int[] eachSDArray : arr2D) {

            for (int eachElement : eachSDArray) {

                System.out.print(eachElement + " ");

            }

            System.out.println();

        }



    }
}
