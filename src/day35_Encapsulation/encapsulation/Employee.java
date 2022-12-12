package day35_Encapsulation.encapsulation;

public class Employee {

    // Instance Variables(Fields)
    private String name;
    private char gender;
    private int age;
    private double salary;
    static int a = 0;
    // Constructor

    public Employee(){

    }

    public Employee(String name, char gender, int age, double salary) {

        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);

    }

    // Setters
    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("Invalid");
            return;
        }
        this.name = name;
    }
    public void setGender(char gender){
        if(!(gender == 'M' || gender == 'F')){
            System.out.println("Invalid");
            return;
        }
        this.gender = gender;
    }
    public void setAge(int age){
        if(age <= 16 || age > 90){
            System.out.println("Invalid");
            return;
        }
        this.age = age;
    }
    public void setSalary(double salary){
        if(salary<=0){
            System.out.println("Invalid");
            return;
        }
        this.salary = salary;
    }

    // Getters
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }

    // toString Method
    public String toString() {
        return "Employee " +  "name: " + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                ", a = " + a +
                '}';
    }
}
