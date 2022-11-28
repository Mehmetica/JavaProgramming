package day_31_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, PM, SM;
    public ArrayList<Tester> testerList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    int daysOfSprint;

    public ScrumTeam(String PO, String PM, String SM, int daysOfSprint) {
        this.PO = PO;
        this.PM = PM;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester newTester) {//bireysel olarak gelen testeri eklemek
        testerList.add(newTester);
    }

    public void addTesters(Tester[] arrayOfTesters) {//array olarak gelen listeyi eklemek
        testerList.addAll(Arrays.asList(arrayOfTesters));//normal array(Tester clasından
        // non-primitive ) i asList ile ArrayList e ekledik
    }

    public void addDeveloper(Developer developer) {//tek bir dev i eklemek
        devopsList.add(developer);
    }

    public void addDevelopers(Developer[] arrayOfDevelopers) {
        devopsList.addAll(Arrays.asList(arrayOfDevelopers));
    }

    public void removeTester(int employeeID) {
        testerList.removeIf(p-> p.employeeID==employeeID);
    }

    public void removeDeveloper(int employeeID) {
        devopsList.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", PM='" + PM + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testerList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
