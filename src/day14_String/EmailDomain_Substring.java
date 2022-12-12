package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "cydeo.school@gmail.com";

        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println(domain);

        String newDomain = domain.replace("gmail","yahoo");
        System.out.println(newDomain);

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
-----------------------------------------------------------------------------------------------------
	trim(): returns new String without the white spaces (unused spaces)

	indexOf(str): returns the index number of first occurred character. returns int

	lastIndexOf(str): returns the index number of last occurred character. returns int

	replace(oldValue, newValue): returns new string by replacing All the old values with the given new value.

	replaceFirst(oldValue, newValue): returns new string by replacing  the FIRST matching old values with the given new value.

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