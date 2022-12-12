package day37_Inheritance.animalTask;

public class Animal {

    public String name, breed;
    public char gender;
    public double age;
    public String size;
    public String color;

    public Animal(){

    }

    public Animal(String name, String breed, char gender, double age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }



}
