package day39_Recap.shapeTask;

public class Shape {

    private String name;
    //    private double side, length, width;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty() || name.isBlank()){
            System.err.println("Name cannot be null or empty.");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

}
