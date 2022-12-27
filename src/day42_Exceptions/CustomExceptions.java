package day42_Exceptions;

class NevzatException extends RuntimeException{

    public NevzatException(String message){
        super(message);
    }

    public NevzatException(){
        super("Time for short break");
    }

}

public class CustomExceptions {

    public static void main(String[] args) {

        //throw new NevzatException("It's time to break");

        //throw new NevzatException();

        throw new RuntimeException();

    }
}
