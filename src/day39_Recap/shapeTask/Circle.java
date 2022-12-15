package day39_Recap.shapeTask;

public class Circle extends Shape{

    private double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                " Radius: " + radius +
                ", Area: " + area() +
                ", Perimeter: " + perimeter() +
                '}';
    }
}
