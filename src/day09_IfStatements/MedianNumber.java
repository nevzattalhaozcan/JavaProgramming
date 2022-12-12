package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        boolean medianA = (a > b && a < c) || (a < b && a > c);
        boolean medianB = (b > a && b < c) || (b < a && b > c);
        boolean medianC = (c > a && c < b) || (c < a && c > b);

        if(medianA){
            System.out.println(a + " is the median number.");
        }
        if(medianB){
            System.out.println(b + " is the median number.");
        }
        if(medianC){
            System.out.println(c + " is the median number.");
        }





    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number
			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
 */