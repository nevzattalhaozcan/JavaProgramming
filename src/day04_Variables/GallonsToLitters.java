package day04_Variables;
/*
5. Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)
					Hints: 1 gallon = 3.79 litters
							1000
							10000
 */
public class GallonsToLitters {

    public static void main(String[] args) {

        int gallon = 10000;
        double litter = gallon * 3.79;

        System.out.println("gallon = " + gallon);
        System.out.println("litter = " + litter);

    }

}
