package day30_CustomClass;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("x","y","XL","yellow",2,'M');
        Dog dog2 = new Dog("a","r","L","black",3,'M');
        Dog dog3 = new Dog("s","g","S","yellow",1,'F');
        Dog dog4 = new Dog("d","h","M","yellow",4,'F');

        System.out.println(dog1);

        System.out.println("--------------------------------------");

        Dog[] arr1 = {dog1, dog2, dog3, dog4};

        for (Dog each : arr1) {

            System.out.println(each.name + " : " + each.age);

        }

        System.out.println("----------------------");

        System.out.println(dog2);

        System.out.println("----------------------");

        dog2.name = "j";

        System.out.println(dog2);



    }
}
