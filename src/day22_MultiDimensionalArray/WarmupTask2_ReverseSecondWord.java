package day22_MultiDimensionalArray;

public class WarmupTask2_ReverseSecondWord {

    public static void main(String[] args) {

        String str = "I Love Java";

        String[] arr = str.split(" ");

        String reversed = "";

        for (int i = arr[1].length()-1; i >= 0 ; i--) {

            reversed += arr[1].charAt(i) + "";

            if(reversed.length() == arr[1].length()){

                str = str.replace(arr[1],reversed);

                System.out.println(str);

            }

        }





    }
}
