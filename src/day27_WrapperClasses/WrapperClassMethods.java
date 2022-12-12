package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

        Integer num = Integer.parseInt(str); // neither autoboxing nor unboxing
        Integer numm = 123;
        System.out.println(num + 0.5);

        System.out.println(str + 1);

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);

        System.out.println(num2 + 0.5);

        System.out.println("---------------------------------------------------------");

        int max = Integer.MAX_VALUE;

        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;

        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        System.out.println("--------------------------------------------------------");

        String s1 = "true";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        String s2 = "maybe"; // default false

        boolean r2 = Boolean.parseBoolean(s2);

        System.out.println(r2);

        System.out.println("----------------------------------------------------------");

        String s3 = "123";

        Integer x = Integer.valueOf(s3); // Integer

        System.out.println(x);

        String s4 = "13.6";

        Double x2 = Double.valueOf(s4);

        System.out.println(x2);

        System.out.println("------------------------------------------------------------");

        char ch1 = '0';
        char ch2 = 'A';
        char ch3 = '@';
        char ch4 = 'a';

        // asdfAASDFSA2131%&+^^

        boolean r3 = Character.isDigit(ch1);

        System.out.println(r3);

        boolean r4 = Character.isLetter(ch2);

        System.out.println(r4);

        boolean r5 = ! Character.isLetterOrDigit(ch3); // symbol

        System.out.println(r5);

        boolean r6 = Character.isUpperCase(ch2);

        System.out.println(r6);

        boolean r7 = Character.isLowerCase(ch4);

        System.out.println(r7);

        System.out.println("------------------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if(Character.isDigit(each))
                sum += Integer.parseInt("" + each);

        }

        System.out.println("sum = " + sum);

    }
}
