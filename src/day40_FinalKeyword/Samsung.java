package day40_FinalKeyword;

//public class Samsung extends IPhone{ // Gives compiler error
//
//    public Samsung(String brand, String model, String color, String size, double price) {
//        super(brand, model, color, size, price);
//    }
//
//}

// IPhone class is final. So, it cannot be inherited.

// ***Every method can be overloaded regardless of whether it is final or not.
    public class Samsung{

        public final int sum(int a, int b){
            return a + b;
        }

        public final int sum(int a, int b, int c){
            return a + b + c;
        }

    }