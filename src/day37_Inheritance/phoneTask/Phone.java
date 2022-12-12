package day37_Inheritance.phoneTask;

//import day37_Inheritance.animalTask.Animal;
//    Animal animal = new Animal("a","s",'a',2,"a","s");
//
//    Phone phone = new Phone();
public class Phone {

    public String brand, model, color, size;
    public double price;
    public static boolean hasBattery = true;

    public Phone(String brand, String model, String color, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                '}';
    }
}
