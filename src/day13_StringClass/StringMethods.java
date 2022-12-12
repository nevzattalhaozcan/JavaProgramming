package day13_StringClass;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String name = "Talha";
        //      Index: 01234

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));

        System.out.println("--------------------");

        String name2 = "TALHA";

        System.out.println(name2.charAt(name2.length()-1)); // We subtract 1, because the index number starts from zero

        name2 = name2.toLowerCase();

        System.out.println(name2);

        name2 = name2.toUpperCase();

        System.out.println(name2);

        System.out.println("--------------------------");

        String s = "Java";
        int n = s.length();
        System.out.println(n);


    }
}
/*
String Methods:

		charAt(index): returns the character at the given index, returns char

		length(): returns the total number of characters. returns int

 */