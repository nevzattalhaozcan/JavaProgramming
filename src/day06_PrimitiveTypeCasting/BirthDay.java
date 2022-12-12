package day06_PrimitiveTypeCasting;
/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.

 */
public class BirthDay {

    public static void main(String[] args) {

        String name = "Talha";
        int birthDay = 26;
        String birthMonth = "March";
        int birthYear = 1996;

        String birth = name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear + ".";

        System.out.println(birth);




    }

}
