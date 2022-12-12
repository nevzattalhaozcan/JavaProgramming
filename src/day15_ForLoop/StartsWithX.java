package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in); We don't use this, because we will use only one word only one time

        System.out.print("Enter a word: ");
        String word = new Scanner(System.in).next();

        if(word.charAt(0) == 'x'){

            word = word.replaceFirst("x","a");

        }
        System.out.print(word);


    }
}
/*
1. Write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */