package day30_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("Nevzat",'M',26,123213,"QA",45000,true);
        employee2.setInfo("Talha",'M',26,324432,"Developer",100000,true);
        employee3.setInfo("Nursena",'F',28,78586,"QA",50000,true);
        employee4.setInfo("Anna",'F',43,73282,"Manager",55000,true);
        employee5.setInfo("John",'M',32,321212,"Senior QA",90000,false);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int full = 0, part = 0;
        double max = employees[0].salary, min = employees[0].salary;

        for (Employee each : employees) {

            if(each.isFullTime)
                full++;
            else
                part++;

            if(each.salary > max)
                max = each.salary;

            if (each.salary < min)
                min = each.salary;

        }

        System.out.println("full = " + full);
        System.out.println("part = " + part);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
