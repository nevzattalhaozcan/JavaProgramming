package day38_Inheritance.carTask;

import day38_Inheritance.carTask.Car;

public class Tesla extends Car {

    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " is on auto-pilot.");
    }

}
/*3. Tesla:
					extra methods:
						autoPilot()*/