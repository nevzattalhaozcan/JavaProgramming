package day18_NestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {

        int j = 0;

        for (int i = 0; i <= 10; i++) {

            while(j<i){

                System.out.println("*");

            }


        }

    }
}
/*Use a nested loop to print the following shape

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * * *
 * * * * * * * * *
 * * * * * * * * * *

 * */