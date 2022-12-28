package day43_Abstraction.employee;

public abstract class Person {

    // Fields
    private String name;
    private int age;
    private char gender;

    // Abstract Methods (different for children)
    public abstract void sleep();

    // Regular Methods (common for children)
    public void eat(){
        System.out.println(name + " is eating baklava");
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age <= 0){
            throw new RuntimeException("Invalid Age: " + age);
        }
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    // Constructor
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    // toString() Method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
