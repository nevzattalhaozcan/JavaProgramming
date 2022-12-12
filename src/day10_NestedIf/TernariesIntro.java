package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

         /*
         for if       >>>  (condition) ?
         for else     >>>  :
         for else if  >>>  :(condition)?
          */

        int n = 5;

        int score = (n<10 && n>-1)? 45 : 34;

        System.out.println(score);

        System.out.println("---------------------");

        int num = 3;

        String result = (num > 0)? "Positive" :(num < 0)? "Negative" : "Zero";

        System.out.println(result);
    }
}
