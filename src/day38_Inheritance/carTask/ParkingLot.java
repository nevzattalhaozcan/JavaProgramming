package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2022, 20000,"blue",100);

        Tesla tesla = new Tesla("Model S",2021,30000,"black",1000);

        BMW bmw = new BMW("i5",2019,33000,"white",150);

        toyota.start();
        tesla.start();
        bmw.start();

    }
}
