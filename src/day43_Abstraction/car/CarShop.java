package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

//        Car car = new Car(); Since Car is an abstract class, it can't be instantiated

        Honda honda = new Honda("Accord","Black",2019,300000);

        Audi audi = new Audi("Q7","Blue",2021,600000);

        Tesla tesla = new Tesla("Model 3","White",2022,800000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-----------------------------------------------------------");

        honda.setColor("Green");
        audi.setPrice(700000);
        tesla.autoPilot();

        System.out.println(honda);
        System.out.println(audi);


    }
}
