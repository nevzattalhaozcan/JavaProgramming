package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String po, ba, sm;
    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();
    public int daysOfSprint;

    //, ArrayList<Tester> testers, ArrayList<Developer> developers

    public ScrumTeam(String po, String ba, String sm, int daysOfSprint) {
        this.po = po;
        this.ba = ba;
        this.sm = sm;
        this.testers = testers;
        this.developers = developers;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        testers.removeIf(p -> p.employeeID == employeeID); // testers.remove(employeeID);
    }

    public void removeDeveloper(int employeeID){
        developers.removeIf(p -> p.employeeID == employeeID); // developers.remove(employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "po='" + po + '\'' +
                ", ba='" + ba + '\'' +
                ", sm='" + sm + '\'' +
                ", total number of testers=" + testers.size() +
                ", total number of developers=" + developers.size() +
                '}';
    }
}
/*create a class called ScrumTeam
	           Attributes:
	                String PO, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	               Add A constructor that can set the fileds PO, BA, and SM

	             Actions:
	                  addTester(Tester tester): adds the given tester to the testers ArrayList

	                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

	                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

	                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

	                  removeTester(long employeeID): removes the given tester from the testers ArrayList

	                  removeDeveloper(long employeeID): removes the developer from the developers ArrayList

	                  toString(): prints number of tester & developers,  PO name, SM name, BA name
*/