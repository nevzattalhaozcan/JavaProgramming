package day14_String;

import day30_CustomClass.Dog;

public class StringMethods1 {

    public static void main(String[] args) {

        String s1 = "    batch   10        ";
        System.out.println("s1 before trim = " + s1);
        s1 = s1.trim(); // remove the white spaces
        System.out.println("s1 after trim = " + s1);



        String s2 = "Cydeo School";
        //   index = 012345678901
        //                     1

        int n1 = s2.indexOf("C");
        System.out.println("n1 = " + n1);

        int n2 = s2.indexOf("oo");
        System.out.println("n2 = " + n2);

        System.out.println("----------------");

        int n3 = s2.lastIndexOf("c");
        System.out.println("n3 = " + n3);

        int n4 = s2.lastIndexOf("S");
        System.out.println("n4 = " + n4);

        int n5 = s2.lastIndexOf("o");
        System.out.println("n5 = " + n5);

    }
}
/*
String Methods:
	charAt(index): returns the character at the given index, returns char
					String s = "Python"
					s.charAt(3) ==> 'h'


	length(): returns the total number of characters, returns int

			last index: length() -1


	toLowerCase(): returns new String in the lower case version of old string object

	toUpperCase(): returns new String in the upper case version of old string object

	trim(): returns new String without the white spaces (unused spaces)

	indexOf(str): returns the index number of first occurred character. returns int

	lastIndexOf(str): returns the index number of last occurred character. returns int

	replace(oldValue, newValue): returns new string by replacing All the old values with the given new value.

	replaceFirst(oldValue, newValue): returns new string by replacing  the FIRST matching old values
	with the given new value.

	substring(beginningIndex , endingIndex): creates substring starting from the given beginning index
	till the given ending index (ending index is excluded)

					String str ="Cydeo School";
				   str.substring(0,  4+1) ==> Cydeo


	substring(beginningIndex): creates substring starting from the given beginning index till the end of the string

					String str = "Cydeo School";
						  str.substring(6) ==> School

	repeat(count): repeats the string for given number of times. returns string


	equals(): checks if two strings have same text, returns boolean
 */