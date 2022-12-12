package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

}
/*
1. Must be first statement
2. Cannot call itself
3. Can call only one constructor
4. Must be used this()
5. Must be called by a constructor
 */