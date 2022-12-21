package day40_FinalKeyword;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    @Override
    public void eat(){
        System.out.println(getName() + " eats dog food");
    }

//    public void drink(){ // Java gives compiler error, because the method is final, it cannot be overridden
//        System.out.println(getName() + " drinks milk");
//    }

}
