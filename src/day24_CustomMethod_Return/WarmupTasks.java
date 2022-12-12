package day24_CustomMethod_Return;

import java.util.Scanner;

public class WarmupTasks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name");
        String first = scanner.nextLine();

        System.out.println("Enter your last name");
        String last = scanner.next();

        initials(first,last);

        System.out.println("Enter your email address");
        String email = scanner.next();

        domain(email);

        System.out.println("Enter a number to print the name of the month");

        nameOfMonth(scanner.nextInt());

        System.out.println("Enter the number of the day");

        nameOfDay(scanner.nextInt());

        System.out.println("Enter the name of a month");

        howManyDays(scanner.next());

        System.out.println("Enter your age");
        
        ageGroup(scanner.nextInt());

    }

    public static void initials(String firstName,String lastName){

        String initial = "";

        initial += firstName.substring(0,1).toUpperCase() + ".";

        while (firstName.contains(" ")){

            initial += firstName.substring(firstName.indexOf(" ") + 1,firstName.indexOf(" ") + 2).toUpperCase();

            firstName = firstName.replaceFirst(" ", "");

        }

        initial += "." + lastName.substring(0,1).toUpperCase();

        System.out.println(initial);



    }

    public static void domain(String email){

        System.out.println(email.substring(email.indexOf("@")+1,email.lastIndexOf(".")));

    }

    public static void nameOfMonth(int number){

        switch (number){

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");

        }


    }

    public static void nameOfDay(int number){

        switch (number){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");

        }

    }

    public static void howManyDays(String month){

        month = month.toLowerCase();

        switch (month){

            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println(month + " has 31 days.");
                break;
            case "february":
                System.out.println(month + " has 28/29 days.");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println(month + " has 30 days.");
                break;
            default:
                System.out.println("Invalid");
        }
    }

    public static void ageGroup(int age){

        if(age >= 1 && age <= 2)
            System.out.println("Infant");
        else if(age >= 3 && age <= 5)
            System.out.println("Toddler");
        else if(age >= 6 && age <= 9)
            System.out.println("Kid");
        else if(age >= 10 && age <= 12)
            System.out.println("Pre-Teen");
        else if(age >= 13 && age <= 17)
            System.out.println("Teenager");
        else if(age >= 18 && age <= 20)
            System.out.println("Young Adult");
        else if(age >= 21 && age <= 39)
            System.out.println("Adult");
        else if(age >= 40 && age <= 49)
            System.out.println("Young Middle-Aged Adult");
        else if(age >= 50 && age <= 54)
            System.out.println("Middle-Aged Adult");
        else if(age >= 55 && age <= 64)
            System.out.println("Very Young Senior Citizen");
        else if(age >= 65 && age <= 74)
            System.out.println("Young Senior Citizen");
        else if(age >= 75 && age <= 84)
            System.out.println("Senior Citizen");
        else if(age >= 85 )
            System.out.println("Old Senior Citizen");
        else
            System.out.println("Invalid");

    }

}
/*1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

                        */