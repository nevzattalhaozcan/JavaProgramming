package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char n = firstName.charAt(firstName.indexOf(" ")+1);
        char l = lastName.charAt(0);

        System.out.println("Initial: " + f + "." + l + ".");

        scan.close();
    }
}
