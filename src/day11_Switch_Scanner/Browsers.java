package day11_Switch_Scanner;

public class Browsers {

    public static void main(String[] args) {

        String browser = "chrome";

        String result = "";

        boolean valid = browser == "chrome" || browser == "firefox" || browser == "opera" || browser == "safari" || browser == "edge";

        if (valid){
            if (browser == "chrome"){
                result = "Chrome Browser is selected";
            } else if (browser == "firefox") {
                result = "Firefox Browser is selected";
            } else if (browser == "opera") {
                result = "Opera Browser is selected";
            } else if (browser == "safari") {
                result = "Safari Browser is selected";
            } else if (browser == "edge") {
                result = "Edge Browser is selected";
            }
        }else{
            System.out.println("Invalid Browser Name");
        }

        System.out.println(result);


        System.out.println("-----------");















    }
}
/*
1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declare a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name
	        Ex:
	        	String browser = "chrome";
	    	Output:
	    		Chrome Browser is selected
			Note: MUST use nested if
 */