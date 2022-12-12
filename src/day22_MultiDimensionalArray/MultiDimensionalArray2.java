package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {

        int[] arr  = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};
        int[] arr4 = {10,11,12};
        int[] arr5 = {13,14,15};
        int[] arr6 = {16,17,18};
//
        int[][] arr2D1 = {arr,arr2,arr3}; // { {1,2,3} , {4,5,6} , {7,8,9} }
        int[][] arr2D2 = {arr4,arr5,arr6};

        int[][][] arr3D = {arr2D1,arr2D2};

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(arr3D[0][1][2]);

        System.out.println("--------------------------------");

        for (int[][] twoD : arr3D) {

            for (int[] oneD : twoD) {

                for (int each : oneD) {

                    System.out.print(each + " ");

                }
                System.out.println();
            }
            System.out.println();
        }



    }
}
