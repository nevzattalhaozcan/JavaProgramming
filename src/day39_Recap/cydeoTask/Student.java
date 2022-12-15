package day39_Recap.cydeoTask;

public class Student extends Person{

    private int studentID;
    private String fieldOfStudy;

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        if(studentID <= 0){
            System.err.println("Invalid Student ID: " + studentID);
            System.exit(1);
        }
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy == null || fieldOfStudy.isBlank() || fieldOfStudy.isEmpty()){
            System.err.println("Field of Study cannot be null or empty.");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                " Name: " + getName() +
                ", Age: " + getAge() +
                ", Gender: " + getGender() +
                ", Student ID: " + studentID +
                ", Field Of Study: " + fieldOfStudy +
                '}';
    }
}
