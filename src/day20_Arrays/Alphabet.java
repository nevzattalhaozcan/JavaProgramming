package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char alphabet[] = new char[26];

//        char ch = 'Z';
//        for (int i = 0, j = ch; i < alphabet.length && ch >='A'; i++, ch--) {
//
//            alphabet[i] = ch;
//
//        }

//        char ch = 'Z';
//        for (int i = 0,j = ch; i < alphabet.length ; i++) {
//            alphabet[i] = ch--;
//        }

        char ch = 'Z';
        for (int i = 0, j = ch; i < alphabet.length; i++, ch--) {
            alphabet[i] = ch;
        }

        System.out.println(Arrays.toString(alphabet));

    }
}
