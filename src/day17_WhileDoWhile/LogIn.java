package day17_WhileDoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = "cydeoschool",
                password = "cydeo123";

        System.out.println("Enter your username");
        String user = scanner.next();

        System.out.println("Enter your password");
        String pass = scanner.next();

        if (user.equals(username) && pass.equals(password)) {

            System.out.println("Logged In");

        } else {
            int attempts = 4;

            while (!(user.equals(username) || pass.equals(password)) && attempts > 0) {

                System.err.println("Invalid username or password. Please try again.");

                System.out.println("Enter your username");
                user = scanner.next();

                System.out.println("Enter your password");
                pass = scanner.next();

                attempts--;
            }

            if (user.equals(username) && pass.equals(password)) {

                System.out.println("Logged In");

            } else {

                System.err.println("Your account is locked");

            }


        }

    }
}