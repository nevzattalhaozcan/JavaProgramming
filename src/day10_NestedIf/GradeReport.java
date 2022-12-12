package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 99;
        boolean range = score >=0 && score <=100;
        boolean didTake = true;
        String result = "";

        if (didTake){ // Whether the student took the exam or not

            if (range){ // Whether the written score is out of range or not

                if (score >= 85){ // score < 100
                    result = "Excellent";
                } else if (score >= 70) { // score < 85
                    result = "Great";
                } else if (score >= 60) { // score < 80
                    result = "Good";
                } else if (score >= 50) { // score < 60
                    result = "Passed";
                }else{ // score < 50
                    result = "Failed";
                }

            }else{
                System.out.println("Invalid Score");
            }

        }else{
            System.out.println("You haven't even taken the exam.");
        }

        System.out.println(result);




    }
}
