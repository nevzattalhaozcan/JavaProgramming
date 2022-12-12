package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-------------------------------------");

        String name2 = "Josh";
        String name3 = "Aaron";

        int creditScore = 720;
        int creditScore2 = 800;
        int age2 = 24;
        int age3 = 20;
        int income1 = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income1 >= 60000;
        boolean isEligible3 = creditScore2 >= 700 && age3 >= 21;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);
        System.out.println(name3 + " is eligible for loan: " + isEligible3);

        System.out.println("----------------------------------------");

        String name4 = "Richard";
        int age4 = 25;
        char gender4 = 'M';

        boolean isEligible4 = age4 >= 18 && (gender4 == 'M' || gender4 == 'F');

        System.out.println(name4 + " is eligible for register: " + isEligible4);

        String name5 = "Donald";
        String countryOfBirth5 = "UK";
        boolean isMarriedWithUsCitizen5 = false;

        boolean isEligible5 = countryOfBirth5 == "US" || isMarriedWithUsCitizen5 == true;

        System.out.println(name5 + " is eligible to be US citizen: " + isEligible5);

        System.out.println("--------------------------------------------------------");

        String student = "Anna";

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible6 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for scholarship: " + isEligible6);










    }
}
