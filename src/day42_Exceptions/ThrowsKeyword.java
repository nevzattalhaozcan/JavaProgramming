package day42_Exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException{

        System.out.println("------------- Test 1 -----------");

        System.out.println("Nevzat");
        Thread.sleep(3000);
        System.out.println("Talha");

        System.out.println("---------- Test 1 Completed ----------");

        System.out.println("----------- Test 2 ---------------------");

        System.out.println("Nevzat");
        Thread.sleep(3000);
        System.out.println("Talha");
        Thread.sleep(3000);
        System.out.println("Özcan");

        System.out.println("------------- Test 2 Completed -------------");

    }
}
