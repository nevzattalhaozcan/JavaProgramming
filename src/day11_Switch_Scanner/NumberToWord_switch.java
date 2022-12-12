package day11_Switch_Scanner;

public class NumberToWord_switch {

    public static void main(String[] args) {

        int number = 5;
        String result = "";

        switch(number){

            case 1:
                result = "One";
                break;

            case 2:
                result = "Two";
                break;

            case 3:
                result = "Three";
                break;

            case 4:
                result = "Four";
                break;

            case 5:
                result = "Five";
                break;

            case 6:
                result = "Six";
                break;

            case 7:
                result = "Seven";
                break;

            case 8:
                result = "Eight";
                break;

            case 9:
                result = "Nine";
                break;

            case 0:
                result = "Zero";
                break;

            default:
                result = "Invalid";
        }

        System.out.println(result);

//        if(number>=0 && number <=9){
//
//            if(number==1){
//                result = "One";
//            } else if (number==2) {
//                result = "Two";
//            } else if (number==3) {
//                result = "Three";
//            } else if (number==4) {
//                result = "Four";
//            } else if (number==5) {
//                result = "Five";
//            } else if (number==6) {
//                result = "Six";
//            } else if (number==7) {
//                result = "Seven";
//            } else if (number==8) {
//                result = "Eight";
//            } else if (number==9) {
//                result = "Nine";
//            }else{
//                result = "Zero";
//            }
//
//        }else{
//            result = "Invalid";
//        }
//
//        System.out.println(result);

    }

}
