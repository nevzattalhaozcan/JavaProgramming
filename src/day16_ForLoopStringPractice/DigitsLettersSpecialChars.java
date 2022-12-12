package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "sadf123-*<.,";

        String digits = "", letters = "", specials = "";

        for(int i = 0; i <= str.length()-1; i++){

            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){

                letters += ch;

            }else if(ch >= '0' && ch <= '9'){

                digits += ch;

            }else{

                specials += ch;

            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specials = " + specials);


    }

}
