package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {

    public static void main(String[] args) {

        int a = 100;
        long b = (long) a;  // This is implicit casting. Implicit casting is done by compiler automatically.

        short c = 102;
        byte d = (byte) c; //This is explicit casting. Explicit casting must be done manually.

        System.out.println(a + " : " + b);
        System.out.println(c + " : " + c);
        System.out.println("--------------------------");

        long e = 120;
        int f = (int) e;
        short g = (short) e;
        byte h = (byte) e;

        System.out.println(e + "|" + f + "|" + g + "|" + h);

        System.out.println("-------------------------------------");

        byte aa = 1;
        short bb = aa;

        System.out.println("----------------");

        int integer1 = 130;
        byte byte1 = (byte) integer1;

        System.out.println(integer1);
        System.out.println(byte1);


    }

}
