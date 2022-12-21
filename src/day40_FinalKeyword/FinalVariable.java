package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;      // as long as there is no constructor to initialize final fields, java gives compiler error
//    final static char gender; // we have to initialize or make it not final

    public FinalVariable(String birthday){
        this.birthday = birthday;
    }

    public static void main(String[] args){

        final double pi = 3.14;

//        pi = 3.54; compiler error because of final variable

//        pi = 21.4; compiler error because of final variable

        final String name;

        name = "Talha";

//        name = "Java"; once a final variable is assigned, it cannot be changed

        FinalVariable obj = new FinalVariable("1/2/3456");

//        obj.birthday = "7/8/9012"; because the constructor initialize the final birthday, it cannot be reassigned

//        gender = 'M'; even if we try to initialize here, it still gives compiler error

    }
}
