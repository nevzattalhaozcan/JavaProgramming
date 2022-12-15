package day39_Recap.shapeTask;

public class ShapeTest {

    public static void main(String[] args) {


        Square square = new Square(10);
        square.setSide(9.4);
        System.out.println(square);

        Rectangle rectangle = new Rectangle(10,5);
        rectangle.setWidth(13);
        rectangle.setLength(4);
        System.out.println(rectangle);

        Circle circle = new Circle(5);
        circle.setRadius(12);
        System.out.println(circle);

    }

}
