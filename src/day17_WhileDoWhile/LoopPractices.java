package day17_WhileDoWhile;

public class LoopPractices {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){

            System.out.print(i);

        }

        System.out.println();

        System.out.println("-------------------------");

        int n1 = 1;

        while(n1 <= 5){

            System.out.print(n1);
            n1++;

        }

        System.out.println();
        System.out.println("--------------------------");

        int n2 = 1;

        do {

            System.out.print(n2);
            n2++;

        }while (n2 <= 5);


    }
}
