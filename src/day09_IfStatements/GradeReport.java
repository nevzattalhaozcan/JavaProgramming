package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 89;
        boolean a = score >= 85;
        boolean b = score >= 70 && score < 85;
        boolean c = score >= 60 && score < 70;
        boolean d = score >= 50 && score < 60;
        boolean f = score >=  0 && score < 50;

        if(a){
            System.out.println("Perfect");
        }else if(b){
            System.out.println("Better");
        }else if(c){
            System.out.println("Better");
        }else if(d){
            System.out.println("Better");
        }else{
            System.out.println("Failed");
        }

    }
}
