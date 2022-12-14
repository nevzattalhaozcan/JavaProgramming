package day38_Inheritance.carTask;

import day38_Inheritance.carTask.Car;

public class BMW extends Car {

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " breaks down.");
    }

    public void racing(){
        System.out.println(brand + " " + model + " is racing.");
    }

}
/*	2. BMW:
					extra methods:
						breaksDown()
						racing()
*/