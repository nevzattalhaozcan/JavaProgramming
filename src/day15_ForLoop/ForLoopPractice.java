package day15_ForLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for(int i = 2; i <= 100; i+=2){

            System.out.print(i + " ");

        }

        System.out.println();

        for(int i = 100; i >=2; --i){

            if(i % 2 == 0){

                System.out.print(i+ " ");

            }

        }

        System.out.println();

    }
}
