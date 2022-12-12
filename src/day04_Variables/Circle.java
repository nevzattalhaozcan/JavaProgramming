package day04_Variables;

public class Circle {

    public static void main(String[] args) {

          double PI = 3.14;
          double radius = 5;
          double diamater = 2 * radius;

          double area = radius * radius * PI;
          double perimeter = 2 * radius * PI;

        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("diamater = " + diamater);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
