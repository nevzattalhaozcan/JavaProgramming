package day42_Exceptions;

public class DisadvantageOfThrows {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        sleep(2.5); // throws

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5); // try & catch

    }

    public static void sleep(double seconds) throws InterruptedException{

        Thread.sleep((long)(seconds * 1000));

    }

}
