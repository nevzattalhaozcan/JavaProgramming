package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] words = {"Paulo Coelho", "Will Durant", "Aldous Huxley", "Margaret Atwood", "Mark Twain"};

        for( String each : words ){

            System.out.println("" + each.charAt(0) + each.charAt(each.indexOf(" ")+1));

        }

    }
}
