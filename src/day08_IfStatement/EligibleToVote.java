package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "James";
        int age = 23;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";

        if(isEligible){
            System.out.println(name + " is eligible for vote.");
        }
        if(!isEligible){
            System.out.println(name + " is not eligible for vote.");
        }
    }
}
