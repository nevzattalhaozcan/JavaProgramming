package day35_Encapsulation;

public class Person {

    // Instance Variables (Fields)
    public  String name, language;
    public int age;
    public char gender;

    // Static Variables
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    // Constructor
    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    // Static Block
    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    // Prints the name of the planet
    public static void printPlanetName(){
        System.out.println("Planet name is " + planet);
    }

    // Prints eating action
    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    // Prints drinking action
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    // toString method
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                '}';
    }
}
