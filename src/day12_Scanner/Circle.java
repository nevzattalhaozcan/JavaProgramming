package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type the radius of your circle");

        double pi = 3.14;
        double radius = input.nextDouble();
        double diameter = radius*2;

        System.out.println("π = 3.14" +" Radius: "+ radius + " Diameter: " + diameter);
        System.out.println("Area: " + (pi*radius*radius));
        System.out.println("Perimeter: " + (diameter*pi));


        input.close();


    }


}
