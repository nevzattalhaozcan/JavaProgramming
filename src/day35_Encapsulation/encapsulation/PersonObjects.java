package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Talha");
        person.setAge(26);


        System.out.println(person.getName() + " : " + person.getAge());

    }
}
