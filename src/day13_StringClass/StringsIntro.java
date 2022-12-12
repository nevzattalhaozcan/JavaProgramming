package day13_StringClass;

public class StringsIntro {

    public static void main(String[] args) {

        // There are two ways to create a String:

        String name = "Talha"; // This is the first and most used way called String literal
        String name2 = "Talha"; // When we create an object with String literal, it is placed inside String Pool. So, if you assign the same data to
                                // another variable name, java won't create a new object, instead it will use the old one.
        boolean equal1 = name == name2;



        String lastName = new String("Ozcan");
        String lastName2 = new String("Ozcan");
        boolean equal2 = lastName == lastName2;
        boolean equal2_1 = lastName.equals(lastName2);


        System.out.println("equal1 = " + equal1);
        System.out.println("equal2 = " + equal2);
        System.out.println("equal2_1 = " + equal2_1);

    }
}
