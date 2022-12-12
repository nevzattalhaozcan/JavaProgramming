package day19_LoopPractices;

public class LoopsWithoutCurlyBraces {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            System.out.println("Cydeo");
            System.out.println("EU-10");

        }

        System.out.println("------------------------------");

        for (int i = 0; i < 5; i++)

            System.out.println("Cydeo"); // Only the first statement gets executed
            System.out.println("EU-10");


    }
}
