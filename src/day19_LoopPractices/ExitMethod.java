package day19_LoopPractices;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if(i==3)
                //break; terminates the loop
                //continue; terminates the current iteration
                System.exit(0); // terminates whole program, pulls the plug

            System.out.println("aa");
        }

        System.out.println("a");

    }

}
