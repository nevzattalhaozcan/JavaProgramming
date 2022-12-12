package day31_Constructors;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10,2);

        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());

        System.out.println("----------------------------------");

        Rectangle rectangle2 = new Rectangle(12,24);

        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());

        System.out.println("----------------------------------");

        System.out.println(rectangle1);
        System.out.println(rectangle2);

    }
}
