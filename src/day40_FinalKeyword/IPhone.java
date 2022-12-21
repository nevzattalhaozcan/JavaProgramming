package day40_FinalKeyword;

import day37_Inheritance.phoneTask.Phone;

public final class IPhone extends Phone {

    public IPhone(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber + " is calling");
    }

    public void faceTime(String email){
        System.out.println(email + " is calling");
    }

}
