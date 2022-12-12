package day11_Switch_Scanner;

public class NameOfMoth_switch {

    public static void main(String[] args) {

        int n = 1;

        switch(n){

            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid Number");
        }

        System.out.println("-------------------");

        int a = 1;
        String result = "";

        switch(a){

            case 1:
                result = "Jan";
                break;

            case 2:
                result = "Feb";
                break;
            case 3:
                result = "Mar";
                break;

            case 4:
                result = "Apr";
                break;

            case 5:
                result = "May";
                break;

            case 6:
                result = "Jun";
                break;

            case 7:
                result = "Jul";
                break;

            case 8:
                result = "Aug";
                break;

            case 9:
                result = "Sep";
                break;

            case 10:
                result = "Oct";
                break;

            case 11:
                result = "Nov";
                break;

            case 12:
                result = "Dec";
                break;

            default:
                result = "Invalid";

        }
        System.out.println(result);

        System.out.println("--------------------------------");

        String x = "xyz";
        double y = 12.5;

        switch (x){

            case "xyz":
                y = 1;
                break;

            case "ali":
                y = 123.4;
                break;
        }
        System.out.println(y);

        System.out.println("---------------------");

        char ch = '@';

        switch (ch){
            
            case 64:
                int v = 23;
                
                switch (v){
                    
                    case 23:
                        System.out.println("a");
                        
                    case 32:
                        System.out.println("b");
                        
                    default:
                        if(3<5){
                            
                            if(a=='2'){
                                System.out.println("sadf");
                            }else{
                                System.out.println("sdafsadf");
                            }
                            
                        }else{
                            System.out.println("wrong");
                        }
                        
                }
                
                break;
            
            case 'a':
                System.out.println("wrong");
                break;

            case 34:
                System.out.println("idk");
                break;

            default:
                System.out.println("invalid");
                break;

        }

        System.out.println("_________________");
        
        int t = 2133;
        
        switch (t){



        }



    }
}
