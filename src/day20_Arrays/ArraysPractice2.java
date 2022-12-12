package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

//---------------------------------------------------------------------------------------------------------------------
        char[] alphabet = new char[26];
//---------------------------------------------------------------------------------------------------------------------

        for (char i = 'A', j = 0; i <= 'Z' && j < alphabet.length ; i++ , j++) { // FIRST WAY

          alphabet[j] = i;

        }
        System.out.println(Arrays.toString(alphabet));

        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0, j = 'A'; i < alphabet.length; i++, j++) { // SECOND WAY

            alphabet[i] = (char) j;

        }

        System.out.println(Arrays.toString(alphabet));

        System.out.println("-----------------------------------------------------------------------------------------");

        char ch = 'A';
        for (int i = 0; i < alphabet.length; i++) { // THIRD WAY

            alphabet[i] = ch++;

        }

        System.out.println(Arrays.toString(alphabet));

//---------------------------------------------------------------------------------------------------------------------

    }
}
