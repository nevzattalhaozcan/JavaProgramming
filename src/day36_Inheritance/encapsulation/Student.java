package day36_Inheritance.encapsulation;

import java.util.Arrays;

public class Student {

    // Private Fields
    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.isEmpty())
            return;
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 5 || age > 90)
            return;
        this.age = age;
    }

    // Getter and Setter for gender
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        if( !(gender == 'M' || gender == 'F') )
            return;
        this.gender = gender;
    }

    // Getter and Setter for grade
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        if( !(Arrays.asList('A', 'B', 'C', 'D', 'F').contains(grade)) )
            return;
        this.grade = grade;
    }

    // Getter and Setter for school name
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        if(schoolName.isEmpty())
            return;
        this.schoolName = schoolName;
    }

    // Constructor
    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    // toString method
    public String toString() {
        return "Student" +
                "\nName: " + name +
                " | Age: " + age +
                " | Gender: " + gender +
                " | Grade: " + grade +
                " | School Name: " + schoolName;
    }
}

/*1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fields (at least encapsulate two fields manually)
					requirements:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any character other than: 'M' and 'F'
						3. grade should not be set to any characters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirements of fields in the above must be applied)


			Methods:
				study()
				toString()*/