package day12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {

        int grade = 14;
        String school = "";

        switch(grade){

            case 1: case 2: case 3: case 4: case 5:
                school = "Elementary school";
                break;

            case 6: case 7: case 8:
                school = "Middle school";
                break;

            case 9: case 10: case 11: case 12:
                school = "High school";
                break;

            case 13: case 14: case 15: case 16:
                school = "College";
                break;

            case 17: case 18:
                school = "Grad school";
                break;

            default:
                System.out.println("Invalid grade level given");
                break;

        }
        System.out.println(school);

        System.out.println("---------------------------------------------------");

        int gradeLevel = 3;

        String schoolType = "";

        if(gradeLevel >=1 && gradeLevel <=18){

            switch (gradeLevel){

                case 1: case 2: case 3: case 4: case 5:
                    schoolType = "Elementary school";
                    break;

                case 6: case 7: case 8:
                    schoolType = "Middle school";
                    break;

                case 9: case 10: case 11: case 12:
                    schoolType = "High school";
                    break;

                case 13: case 14: case 15: case 16:
                    schoolType = "College";
                    break;

                default:
                    schoolType = "Grad school";
                    break;

            }

        }else{
            System.out.println("Invalid grade level given");
        }
        System.out.println(schoolType);




    }

}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type
 someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given

                Note:
                    Solution 1: Use switch statement
                    Solution 2: use if & switch both

 */