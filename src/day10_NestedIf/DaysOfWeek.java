package day10_NestedIf;

public class DaysOfWeek {

    public static void main(String[] args) {

        int n = 1;

        if (n >= 1 && n <=7) {
            String day = (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday"
                       : (n == 4) ? "Thursday" : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday";
            System.out.println(day);
        }else{
            System.out.println("Invalid Number");
        }


    }
}
