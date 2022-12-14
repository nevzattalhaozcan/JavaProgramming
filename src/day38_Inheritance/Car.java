package day38_Inheritance;

public class Car {

    // Private instance fields
    private String brand, model;
    private int year;
    private double price;
    private String color;
    private int miles;

    // Constructor
    public Car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    // Instance Methods
    public void start(){
        System.out.println(brand + " " + model + " has started.");
    }
    public void drive(){
        System.out.println(brand + " " + model + " is driving.");
    }

    // toString Method
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }

}
/*carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()

		Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()

			2. BMW:
					extra methods:
						breaksDown()
						racing()

			3. Tesla:
					extra methods:
						autoPilot();*/