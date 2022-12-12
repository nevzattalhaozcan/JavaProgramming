package day25_MethodOverloading;

import utilities.StringUtility;

import java.util.Arrays;
import java.util.Scanner;

public class OverloadingIntro {

    public static void main(String[] args) {

        sum(6,7);







    }

    public static void sum(int num1, int num2){

        System.out.println(num1+num2);

    }

    public static void sum(int num1, String num2){

        System.out.println(num1+num2);

    }

}
