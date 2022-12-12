package day09_IfStatements;

public class PassedOrFailed {

    public static void main(String[] args) {

        int score = 67;

        boolean pass = score > 70;

        if(pass){
            System.out.println("Congrats, you passed.");
        }else{
            System.err.println("Failed");
        }

    }
}
