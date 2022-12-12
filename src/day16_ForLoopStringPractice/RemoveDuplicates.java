package day16_ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "afabcdcdefaff";

        String result = "";

//        for (int i = 0; i <= str.length()-1; i++) {
//
//            if(!(str.substring(i+1).contains(""+str.charAt(i)))){
//
//                control += "" + str.charAt(i);
//
//            }
//
//
//        }
//
//        System.out.println(control);
        for (int i = 0; i < str.length(); i++) {
            String ch = ""+str.charAt(i);
            if(!result.contains(ch)){
                result += ch;
            }
        }
        System.out.println(result);

    }
}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each character of the string into another String
				  Condition: the character is not contained in the other String, yet before you are adding
 */