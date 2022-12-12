package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Talha",
                buildingNumber = "213R",
                streetName = "Tahir Ün",
                city = "Akhisar",
                state = "Turkey",
                zipcode = "3432A";

        System.out.println("name = " + name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipcode = " + zipcode);
        System.out.println();

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + "," + state + " " + zipcode);

    }

}
/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
 */