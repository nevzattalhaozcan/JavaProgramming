package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        boolean result1 = 200 > 40;
        System.out.println("result1 = " + result1);

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; //if the credit score is 720 or greater, then eligible for loan
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean equal = "Java" == "Java";
        System.out.println("equal = " + equal);

        boolean notEqual = "Java" != "Java";
        System.out.println("notEqual = " + notEqual);


    }

}
