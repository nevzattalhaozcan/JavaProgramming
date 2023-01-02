package day44_Abstraction.animalTask;

public final class Dog extends Animal{

    public Dog(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }

    public void bark(){
        System.out.println("Woof! Woof!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating pizza.");
    }

}
/*
Dog
					eat(): eats Pizza
 */