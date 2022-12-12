package day31_Constructors.scrumTask;

import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Nevzat", 1,"QA",100000);
        Tester tester2 = new Tester("Nursena",2,"Senior QA",120000);
        Tester tester3 = new Tester("Talha",3,"Junior SDET",70000);
        Tester tester4 = new Tester("Özcan",4,"Manual Tester",60000);

        Tester[] group1 = {tester2,tester3,tester4};

        Developer developer1 = new Developer("Alex",5,"Java Developer",123000);
        Developer developer2 = new Developer("Layan",6,"Java Master",185000);
        Developer developer3 = new Developer("Lala",7,"Software Developer",153000);
        Developer developer4 = new Developer("Ali",8,"Senior Developer",223000);

        Developer[] group2 = {developer2,developer3,developer4};

        ScrumTeam scrum = new ScrumTeam("Nigara","Huseyin","Neira",13);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(group1);
        scrum.addDevelopers(group2);

        System.out.println(scrum);

        for (Tester tester : scrum.testers) {

            System.out.println(tester.name + " : " + tester.salary);

        }

        System.out.println("----------------------------------");

        for (Developer developer : scrum.developers) {

            System.out.println(developer.name + " : " + developer.salary);

        }

        System.out.println("-----------------------------------");

        scrum.removeDeveloper(8);
        scrum.removeTester(4);

        System.out.println(scrum);

    }
}
