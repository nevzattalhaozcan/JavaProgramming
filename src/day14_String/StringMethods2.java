package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------");

        String s1 = "My name is Halil. My brother's name is Talha.";
        String s2 = s1.replace("Halil", "Talha" );
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println("---------------------------------------------------------------");

        s2 = s2.replace("Talha", "!");
        System.out.println("s2 = " + s2);

        String s3 = s2.replace("!", "Halil");
        System.out.println("s3 = " + s3);

        System.out.println("---------------------------------------------------------------");

        String s4 = "Water is solid. Ice is liquid.";
        s4 = s4.replace("liquid","?");
        s4 = s4.replace("solid","liquid");
        s4 = s4.replace("?","solid");
        System.out.println("Last s4: " + s4);

        System.out.println("----------------------------------------------------------------");

        String s5 = "Java is a programming language. I like Java.";
        s5 = s5.replaceFirst("Java", "C#");
        System.out.println(s5);

        System.out.println("----------------------------------------------------------------");

        String s6 = "Java is my favorite.";
        s6 = s6.replaceAll("\\s", "");
        System.out.println(s6); // \\s is used for white spaces

        System.out.println("-----------------------------------------------------------------");

        String s7 = "I don't know.";
        s7 = s7.replace(" ", "");
        System.out.println(s7);

    }
}
