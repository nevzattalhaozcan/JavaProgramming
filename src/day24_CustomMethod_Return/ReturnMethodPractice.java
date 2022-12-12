package day24_CustomMethod_Return;

import java.util.Scanner;

public class ReturnMethodPractice {

//    public static void main(String[] args) {
//
//        int maxNumber = max(123,345);
//
//        System.out.println(maxNumber*2);
//
//    }
//
//    public static int max(int num1,int num2){
//
//        int result = 0;
//
//        if(num1 > num2)
//            result = num1;
//        else
//            result = num2;
//
//        return result;
//
//    }

    // 25 35 >> 35

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = "abc";
        System.out.println(maxNumber(30,35));

        System.out.println(ReturnMethodIntro.reverse(a));
    }

    public static int maxNumber(int num1, int num2){

        int max = 0;
        String result = "";

        if(num1 > num2)
            max = num1;
        else if(num2 > num1)
            max = num2;
        else
            result = "equal";

//        if(num1 != num2)
            return max;

    }


}
