package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +23;
        int num2 = -23;

        System.out.println("num1+num2 = " + (num1 + num2));
        System.out.println("num1-num2 = " + (num1 - num2));

        System.out.println("----------------------------");

        int a = 5;

        System.out.println("a = " + a);

        ++a;

        System.out.println("++a = " + a);

        --a;

        System.out.println("--a = " + a);

        System.out.println("--------------------------");

        int x = 100;

        System.out.println("x = " + x++);
        System.out.println("x = " + x);
        System.out.println("x = " + x--);
        System.out.println("x = " + x);

        System.out.println("----------------------------");

        int y = 10;

        System.out.println("y = " + y);

        y++;

        System.out.println("y = " + y);

        System.out.println("----------------------------");

        int t = 24;

        t ++; // Because this statement is also a process.

        System.out.println("t = " + t); // OUTPUT: t = 25


    }
}
