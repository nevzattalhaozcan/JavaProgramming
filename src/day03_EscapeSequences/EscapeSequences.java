package day03_EscapeSequences;
/*
    \n : for new line
    \t : for paragraph space
    \\ : for backward slash \
    \" : for double quote "
 */
public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println();
        System.out.println(">>>If you wanna your printing start from new line \nYou should use backward slash and n.");
        System.out.println("----------------------------------");
        System.out.println(">>>If you wanna your code start with a paragraph space, \n\tput a backward slash and t.");
        System.out.println("----------------------------------");
        System.out.println(">>>To use backward slash as a string of text, you should put backward slash twice \\.");
        System.out.println("----------------------------------");
        System.out.println(">>>If you wanna use double quote, \"you should use it after backward slash\"");
        System.out.println();
    }

}
