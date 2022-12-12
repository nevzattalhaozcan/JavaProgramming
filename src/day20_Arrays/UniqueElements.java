package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

//        string array
        String[] elements = {"a", "a", "b", "c", "c", "d"};

        for (int i = 0; i < elements.length; i++) {

            int frequency = 0;

            for (int j = 0; j < elements.length; j++) {

                if(elements[i].equals(elements[j]))
                    frequency++;

            }

            if(frequency == 1)
                System.out.println(elements[i]);

        }


//        if

//        print
    }
}
