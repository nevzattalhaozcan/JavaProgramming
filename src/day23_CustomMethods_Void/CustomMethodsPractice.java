package day23_CustomMethods_Void;

public class CustomMethodsPractice {

   public static void helloWorld5Times(){

       for (int i = 0; i < 5; i++) {
           System.out.println("Hello World!");
       }

   }

   public static void helloCydeo5Times(){

       for (int i = 0; i < 5; i++) {
           System.out.println("Hello Cydeo!");
       }

   }

   public static void from1to10(){
       for (int i = 1; i <= 10; i++) {
           System.out.println(i);
       }
   }

    public static void main(String[] args) {

       helloWorld5Times();

       System.out.println("-----------------");

       helloCydeo5Times();

        System.out.println("-----------------");

        from1to10();



   }

}
