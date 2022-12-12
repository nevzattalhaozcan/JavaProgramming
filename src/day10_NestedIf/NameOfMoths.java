package day10_NestedIf;

public class NameOfMoths {

    public static void main(String[] args) {

        int month = 10;
        String result = "";
        
        if (month >=1 && month <=12){ // If the number is invalid or not
            
            if(month == 1){
                result = "January";
            } else if (month == 2) {
                result = "February";
            }else if (month == 3) {
                result = "March";
            }else if (month == 4) {
                result = "April";
            }else if (month == 5) {
                result = "May";
            }else if (month == 6) {
                result = "June";
            }else if (month == 7) {
                result = "July";
            }else if (month == 8) {
                result = "August";
            }else if (month == 9) {
                result = "September";
            }else if (month == 10) {
                result = "October";
            }else if (month == 11) {
                result = "November";
            }else{
                result = "December";
            }

        }else{
            result = "Invalid Number";
        }
        System.out.println(result);



    }
}
