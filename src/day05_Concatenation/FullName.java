package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {


        String firstName = "Nevzat Talha";
        String lastName = "Özcan";
        String fullName = firstName + " " + lastName;
        byte age = 26;
        String jobTitle = "student";
        String companyName = "Cydeo";
        double salary = 1000.23;

        System.out.println(firstName + " " + lastName);

        System.out.println("Full name of the person is " + fullName );

        System.out.println(fullName + " is " + age + " years old.");

        System.out.println(fullName + " is a " + jobTitle + " in " + companyName + " and his salary is $" + salary + ".");



    }
}
/*
1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address
 */