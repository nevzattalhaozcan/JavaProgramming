package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = "Cydeo", password = "WoodenSpoon";
        int attempts = 0, remaining = 3;

        do {
            System.out.println("Enter your username");
            String user = scanner.nextLine();

            System.out.println("Enter your password");
            String pass = scanner.nextLine();

            if(user.equals(username) && pass.equals(password)){

                System.out.println("Logged In");
                break;

            }else{

                System.err.println("Wrong username or password");
                attempts++;
                remaining--;
                System.err.println(remaining);

            }

        }while (attempts < 3);

        if(remaining==0) {
            System.err.println("Your account is locked");
        }


    }
}
/*2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched,
                         the program should allow the user to have three attempts to enter correct credentials and
                          if all three attempts are failed, then print "Your account is locked."
*/