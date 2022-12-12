package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee = new Employee("Talha",'A',26,100000);

        employee.a = 2;

        System.out.println(employee);

    }
}
