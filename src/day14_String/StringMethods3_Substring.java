package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        String s1 = "Java Programming.";
        //           01234567890123456
        //                     1

        String name = s1.substring(0,3+1);
        System.out.println(name);

        String name2 = s1.substring(5,16);
        System.out.println(name2);

        System.out.println("---------------");

        String name3 = s1.substring( s1.indexOf(" ")+1 , s1.indexOf(".") );
        System.out.println(name3);

        String name4 = s1.substring(s1.indexOf("J"), s1.indexOf(" "));
        System.out.println(name4);

        System.out.println("-------------------------------------------------------");

        String name5 = s1.substring(s1.indexOf(" ")+1);
        System.out.println(name5);


    }
}
