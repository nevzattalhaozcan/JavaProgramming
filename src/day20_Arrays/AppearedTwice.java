package day20_Arrays;

public class AppearedTwice {

    public static void main(String[] args) {


//      chars
        char[] ch = {'a', 'g', 'a', 'g', 'r', 't', 't', 't'};

        String res = "";
//        for
//        for
        for (int i = 0; i < ch.length; i++) {

            int frequency = 0;

            for (int j = 0; j < ch.length; j++) {

                if(ch[j] == ch[i]){
                    frequency++;
                }

            }
//        if
            if(frequency == 2){

                if(!res.contains(""+ch[i])) {

                    res += ch[i] + "";

                }
            }


        }

        System.out.println(res);

    }
}


/*
* high frequency
*
*   nested
*
*   two loop
*
* */