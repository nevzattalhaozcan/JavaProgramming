package day17_WhileDoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "dog dog dog cat cat cat dog";

        int dogCounter = 0;
        int catCounter = 0;

        while (str.contains("dog")){

            str = str.replaceFirst("dog", "");
            dogCounter++;

        }
        while (str.contains("cat")){

            str = str.replaceFirst("cat", "");
            catCounter++;

        }
        System.out.println("dogCounter = " + dogCounter);
        System.out.println("catCounter = " + catCounter);

        System.out.println("--------------------------");

        String str2 = "dog dog dog cat cat dog dog cat";
        int dogCounter2 = 0;
        int catCounter2 = 0;

        while(str2.contains("dog") || str2.contains("cat")){

            if(str2.contains("dog")){

                str2 = str2.replaceFirst("dog","");
                dogCounter2++;

            }
            if(str2.contains("cat")){

                str2 = str2.replaceFirst("cat","");
                catCounter2++;

            }
        }

        System.out.println("dogCounter2 = " + dogCounter2);
        System.out.println("catCounter2 = " + catCounter2);


    }
}
