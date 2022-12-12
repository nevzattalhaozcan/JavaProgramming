package day15_ForLoop;

public class AlphabetAndAsciiTable {

    public static void main(String[] args) {

        for(char i = 'a'; i <= 'z'; i++){

            System.out.print(i + " ");

        }

        System.out.println();
        System.out.println("-------------------------------------------------------------");

        for(int i = 0; i <= 127; i++){

            System.out.print((char)i + " ");
            System.out.println(i + ". ");

        }

        System.out.println("-------------------------------------------------------------");

        for(char i = 'Z'; i >= 'A'; --i){

            System.out.print(i + " ");

        }


    }
}
