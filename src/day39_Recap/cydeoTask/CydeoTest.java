package day39_Recap.cydeoTask;

public class CydeoTest {

    public static void main(String[] args) {

        Developer developer = new Developer("Nevzat", 26,'M', 1,"Java Developer",150000);

        Tester tester = new Tester("Talha", 26,'M', 2,"SDET",100000);

        Teacher teacher = new Teacher("Özcan",26,'M',3,"Math Teacher",50000);

        Student student = new Student("Halil",20,'M',4,"Engineer");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

    }
}
