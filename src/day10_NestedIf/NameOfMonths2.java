package day10_NestedIf;

public class NameOfMonths2 {

    public static void main(String[] args) {

        int n = 11;

        String month =
             (n >= 1 && n <=12)?
                   (n==1)? "Jan" :(n==2)? "Feb" :(n==2)? "Mar" :(n==3)? "Apr" :(n==4)? "May" :(n==5)? "Jun"
                  :(n==6)? "Jul" :(n==7)? "Aug" :(n==8)? "Sep" :(n==9)? "Oct" :(n==10)? "Nov" : "Dec"
             : "Invalid Number";

        System.out.println(month);
    }
}
