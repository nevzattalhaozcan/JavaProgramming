package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your hourly rate");
        double hourlyRate = input.nextDouble();

        System.out.println("Please enter how many hours you work in a week");
        int weeklyHour = input.nextInt();

        double salary = hourlyRate*weeklyHour;

        System.out.println("Please enter your state tax in percentage");
        double stateTaxRate = input.nextDouble();
        double stateTax = stateTaxRate*salary;

        System.out.println("Please enter your federal tax in percentage");
        double federalTaxRate = input.nextDouble();
        double federalTax = federalTaxRate*salary;

        double totalTax = federalTax+stateTax;

        System.out.println("RESULT");
        System.out.println("Salary: $" + (hourlyRate*weeklyHour*4));
        System.out.println("State Tax: " + stateTax);
        System.out.println("Federal Tax: " + federalTax);
        System.out.println("Total Tax: $" + totalTax);
        System.out.println("Net Income: $" + (salary - totalTax));



        input.close();
    }
}
