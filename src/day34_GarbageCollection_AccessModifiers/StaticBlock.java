package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static { // runs first before everything and runs once
        System.out.println("Static Block");
    }

    static {
        System.out.println("Static Block 2");
    }

}
