package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("2" + 1); //concatenation

        System.out.println(100 / 3d);

        System.out.println(10/4.0);

        int t = 123;

        System.out.println(t/4d);
        System.out.println("---------------------------");
        char gender = 'M';
        int number1 = (int) gender;

        System.out.println(gender + " | " + number1);

        int num1 = 10, num2 = 20;

        System.out.println("sum = " + (num1 + num2));
        System.out.println("***************************");

        System.out.println(13/4.0);

    }
}
/*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division
            integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal
            in math:
                10/4 = 2.5
                100/3 = 33.333....
            in java:
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33
    %: Remainder
 */