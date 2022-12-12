package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccdeee";
        String result = "";

//        for (int i = 0; i < str.length(); i++) {
//
//            if(!(str.substring(i+1).contains(""+str.charAt(i))) && !(str.substring(0,i).contains(""+str.charAt(i)))){
//
//                result += "" + str.charAt(i);
//
//            }
//
//        }
        for (int i = 0; i < str.length(); i++) {

            String ch = ""+str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){

                result += ch;

            }

        }


        System.out.println(result);

    }
}
