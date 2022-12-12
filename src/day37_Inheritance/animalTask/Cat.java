package day37_Inheritance.animalTask;

public class Cat extends Animal {

    public String owner;

    public Cat(String name, String breed, char gender, double age, String size, String color, String owner) {
        super(name, breed, gender, age, size, color);
        this.owner = owner;
    }

    public void stroked(){
        System.out.println(name + " is being stroked by " + owner);
    }

    public void purr(){
        System.out.println(name + " is purring on " + owner);
    }

}
