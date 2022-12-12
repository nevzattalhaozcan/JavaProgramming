package day14_String;

public class StringMethods4 {

    public static void main(String[] args) {

        String name = "Talha";

        String repeatName = name.repeat(5);
        System.out.println("repeatName = " + repeatName);

        System.out.println("Java\t".repeat(10));

        System.out.println("Programming\n".repeat(10));

        System.out.println("A".indexOf("A"));

        System.out.println((name + "\n").repeat(3));

    }
}
