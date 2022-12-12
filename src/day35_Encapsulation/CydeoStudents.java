package day35_Encapsulation;

public class CydeoStudents {

    // Instance Variables(Fields)
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public String fieldOfStudy;

    // Static Variables
    public static String schoolName;
    public static String programmingLanguage;
    public static String secretCode;

    // Constructor
    public CydeoStudents(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy, String secretCode) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public void attendClass(){
        System.out.println(name + " is attending class.");
    }

    public static void printProgrammingLanguage(){
        System.out.println();
    }



}
