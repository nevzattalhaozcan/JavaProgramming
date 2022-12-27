package day42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws ArithmeticException {

        System.out.println("Test Started");

        System.out.println(8/0); // Unchecked exception, so, do not use throws keyword

        System.out.println("Test Completed"); // cannot be printed because of exception





    }
}
