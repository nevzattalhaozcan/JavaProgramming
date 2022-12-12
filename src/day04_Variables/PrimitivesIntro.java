package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args){

        // age: 26 years old

        byte age = 26;

        // weight: 160 pounds

        // byte weight = 160; ERROR: 160 is out of range

        short weight = 160;

        // salary: 100000 $

        // short salary = 100000; ERROR: 100000 is out of range

        int salary = 100000; //int is preferred data type for integer numbers

        //  asset: 3,000,000,000 for java it should be 3_000_000_000

        long asset = 3_000_000_000L;

        // tax: 0.26

        float tax = 0.26F;

        // #

        char ch1 = '#';

        char ch2 = 178;

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        char gender = 'M';

        char grade = 'A';

        System.out.println("gender = " + gender);
        System.out.println("grade = " + grade);

        // boolean true/false

        boolean result = 2 < 2;

        System.out.println("result = " + result);

        // more than one character String

        String name = "Talha";

        System.out.println("name = " + name);









    }

}
