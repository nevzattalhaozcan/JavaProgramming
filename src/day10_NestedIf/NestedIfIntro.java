package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        System.out.println("----------------------------------");
        int age = 33;
        boolean hasID = false;

        if(hasID){
            if(age>=18){
                System.out.println("You can buy alcohol");
            }else{
                System.out.println("You must be 18 years old or older");
            }

        }else{
            System.out.println("You must have an ID");
        }


        System.out.println("-----------------------------------------");

        int salary = 70000,
            otherMoney = 9000;

        boolean isClient = false,
                hasFriend = true;

        if (isClient){ // First, he/she must be a client

            if(hasFriend){ // Second, he/she must have a friend to pay credit in case he/she can't

                if (salary >=55000){ // Third, his/her salary must be 55000 at least

                    if (otherMoney >= 4000){ // Fourth, he/she must have extra money to give in case he/she can't pay on time
                        System.out.println("You can get credit");
                    }else{
                        System.out.println("Your other money must be 4000 at least");
                    }

                }else {
                    System.out.println("Your salary must be 55000 at least");
                }

            }else{
                System.out.println("You must have a friend to get credit");
            }

        }else{
            System.out.println("You must be a client of our bank to get credit");
        }


        System.out.println("----------------------------------------------------");





    }




}
