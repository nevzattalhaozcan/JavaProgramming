package day34_GarbageCollection_AccessModifiers;

public class Test {
    /*

            1
          222
        33333
      4444444
    555555555

     */
    public static void main(String[] args) {

        for (int i = 1, j = 1; i <= 5; i++, j+=2) {

            System.out.println(" ".repeat(9-j) + (""+i).repeat(j));

        }

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        String str = "home";

        for (char each : str.toCharArray()) {

            for (char vowel : vowels) {

                if(vowel == each)
                    System.out.print(each + " ");

            }

        }


    }

}
