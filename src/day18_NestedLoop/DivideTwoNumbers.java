package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int n1 = 43, n2 = 11,result = 0;

        while(n1-n2>0) {

            result++;
            n1 -= n2;

        }

        System.out.println("result = " + result);
        System.out.println("n1 = " + n1);

    }
}
/*1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators*/