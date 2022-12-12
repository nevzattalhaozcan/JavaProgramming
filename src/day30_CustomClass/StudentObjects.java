package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student1.setInfo("Nevzat",'M',26,123456,'A');

        student2.setInfo("Talha",'M',25,654321,'B');

        student3.setInfo("Özcan",'M',27,13579,'A');

        student4.setInfo("Nursena",'F',28,24680,'A');

        student5.setInfo("Tekoğlu",'F',29,123098,'B');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student each : students) {

            System.out.println(each);

        }

        System.out.println("------------------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(Arrays.asList(students));
        earlyBirds.removeIf(p -> p.grade != 'A');

        ArrayList<Student> angryBirds = new ArrayList<>(Arrays.asList(students));
        earlyBirds.removeIf(p -> p.grade == 'A');

        System.out.println(earlyBirds);
        System.out.println(angryBirds);


    }
}
