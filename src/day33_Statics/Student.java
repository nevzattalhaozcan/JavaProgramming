package day33_Statics;

public class Student {

    public double radius;
    public double diameter;

    public Student(double radius) {
        this.radius = radius;
        diameter = radius * radius;
    }

//    public double setDiameter(){
//        diameter = radius * radius;
//        return diameter;
//    }

    public String toString() {
        return "Student{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }


}
