package day35_Encapsulation.encapsulation;

public class Person {

//    public String color;
//    public void setColor(String color){
//        if(color.isEmpty()){
//            System.err.println("Invalid Entry");
//            System.exit(0);
//        }
//        this.color = color;
//    }

/*
    private static char gender;

    public static void setGender(char gender) {
        Person.gender = gender;
    }
*/

    // Instance Variables
    private String name;
    private int age;

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }



}

