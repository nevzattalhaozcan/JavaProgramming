package day15_ForLoop;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String str1 = "  ";

        System.out.println("st1 is: " + str1);
        System.out.println("Is str1 empty? " + str1.isEmpty());
        System.out.println("Length of str1: " + str1.length());

        System.out.println("-------------------------------");

        String str2 = "     i      ";

        System.out.println("str2 is: " + str2);
        System.out.println("Is str2 blank? " + str2.isBlank());

        System.out.println("--------------------------------");

        String str3 = "Java";
        String str4 = "java";

        System.out.println("str3: " + str3);
        System.out.println("str4: "+ str4);
        System.out.println("Do str3 and str4 have the same letters? " + str3.equalsIgnoreCase(str4));
        System.out.println("Are str3 and str4 exactly the same? " + str3.equals(str4));

        System.out.println("------------------------------------------------------------");

        String str5 = "Java";

        System.out.println("str5: " + str5);
        System.out.println("Does str5 include the word \"java\": " + str5.contains("java"));
        System.out.println("Does str5 include letters of the word \"java\": " + str5.toLowerCase().contains("java"));

        System.out.println("--------------------------------------------------------------");

        String str6 = "Java is my favorite programming language.";

        System.out.println("str6: " + str6);
        System.out.println("Does str6 start with \"Java\"? " + str6.startsWith("Java"));
        System.out.println("Does str6 start with \"java\"? " + str6.startsWith("java"));
        System.out.println("Does str6 end with \"language.\"? " + str6.startsWith("Java"));
        System.out.println("Does str6 end with \".\"? " + str6.startsWith("Java"));

    }
}
