package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type your score and hit the enter");

        int score = input.nextInt();
        String result = "";

        if(score >= 0 && score <= 100){

            result = (score >=85)?"A-Excellent" :(score >=70)?"B-Great" :(score >=60)?"C-Good"
                    :(score >=50)?"D-Passed" :"F-Failed";

        }else{
            result = "Invalid Score";
        }
        System.out.println(result);

        input.close();


    }
}
