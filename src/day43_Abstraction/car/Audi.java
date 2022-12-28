package day43_Abstraction.car;

public final class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override    // start() method is an abstract, so, it has to be overridden
    public void start() {
        System.out.println("Push the start button");
    }

    public void autoPark(){
        System.out.println(getBrand() + " " + getModel() + " has auto park feature");
    }

}

