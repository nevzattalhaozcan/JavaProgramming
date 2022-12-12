package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("BMW","X5","Blue",2,45000);

        System.out.println(car1);

        Car car2 = new Car();

        car2.setInfo("Toyota","Corolla","Beige",14,35000);

        System.out.println(car2);

        Car car3 = new Car();



        car3.setInfo("Ford","Focus","White",4,40000);

        System.out.println(car3);

        ArrayList<Car> myCars = new ArrayList<>();

        myCars.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : myCars) {

            System.out.println(each.brand + " = " + each.price);

        }

        myCars.removeIf(p -> p.year > 5);

        System.out.println(myCars);

    }
}
