package day44_Abstraction.animalTask;

public final class Cat extends Animal{

    public Cat(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating biryani.");
    }
}

/*
Cat
					eat(): eats Biryani
 */