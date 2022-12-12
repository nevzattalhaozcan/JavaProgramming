package day30_CustomClass;

public class Dog {

//    public String name;
//    public int age;
//    public char gender;
//    public String breed;
//    public String size;
//    public String color;
//
////    public void setInfo(String dogName, int dogAge, char dogGender, String dogBreed, String dogSize, String dogColor){
////
////        name = dogName;
////        age = dogAge;
////        gender = dogGender;
////        breed = dogBreed;
////        size = dogSize;
////        color = dogColor;
////
////    }
//
//    public Dog(String name, int age, char gender, String breed, String size, String color) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.breed = breed;
//        this.size = size;
//        this.color = color;
//    }
//
//    public void eat(){
//        System.out.println(name + " is eating");
//    }
//
//    public void play(){
//        System.out.println(name + " is playing");
//    }
//
//    public void bark(){
//        System.out.println(name + " is barking");
//    }
//
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                ", breed='" + breed + '\'' +
//                ", size='" + size + '\'' +
//                ", color='" + color + '\'' +
//                '}';
//    }

    public String name, breed, size, color;
    public int age;
    public char gender;

    public Dog(String name, String breed, String size, String color, int age, char gender) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public String toString() {
        return "Dog{" +
                "name = '" + name + '\'' +
                ", breed = '" + breed + '\'' +
                ", size = '" + size + '\'' +
                ", color = '" + color + '\'' +
                ", age = " + age +
                ", gender = " + gender +
                '}';
    }

}
/*
* Attributes:
*   name, age, gender, breed, size, color
*
* Actions:
*   eat(), play(), bark()
*
* */