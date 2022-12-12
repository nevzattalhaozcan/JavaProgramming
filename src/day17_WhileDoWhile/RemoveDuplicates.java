package day17_WhileDoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result = "";

        for (int i = 0; i <= str.length()-1; i++){

            if(result.contains(""+str.charAt(i))){
                continue;
            }
            result += ""+ str.charAt(i);

        }

        System.out.println(result);

    }
}
