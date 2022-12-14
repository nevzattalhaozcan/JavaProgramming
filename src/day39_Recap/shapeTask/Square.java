package day39_Recap.shapeTask;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            System.err.println("Invalid Side: " + side);
            System.exit(1);
        }
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                " Side: " + side +
                ", Area: " + area() +
                ", Perimeter: " + perimeter() +
                '}';
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }
}
