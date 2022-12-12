package day04_Variables;
/**
 6. Create a class named EmployeeInfo. declare the following variables:
 1. name (String)
 2. age (int)
 3. gender (char)
 4. company (String)
 5. jobTitle (String)
 6. yearsOfExpereince (double)
 7. salary (int)
 8. isFullTime (boolean)
 9. isMarried (boolean)
 10. employeeId (String)
 11. SSN (String)

 */
public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "Talha";
        int age = 26;
        char gender = 'M';
        String company = "Cydeo";
        String jobTitle = "Java SDET";
        double yearsOfExperience = 0.5;
        int salary = 3000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "EU10";
        String SSN = "(232)-231-22-22";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = $" + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("SSN = " + SSN);


    }


}
