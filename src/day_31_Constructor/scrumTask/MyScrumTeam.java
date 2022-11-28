package day_31_Constructor.scrumTask;

import java.util.ArrayList;

public class MyScrumTeam {
    public static void main(String[] args) {
        ArrayList<Tester> testerArrayList = new ArrayList<>();
        ArrayList<Developer> developerArrayList = new ArrayList<>();

        Tester tester1 = new Tester("mehmet","AQ",1,150000);
        Tester tester2 = new Tester("cemil","SDET",2,160000);
        Tester tester3 = new Tester("lokman","SDET",3,170000);
        Tester tester4 = new Tester("inna","SE",7,180000);

        Tester[] testerArray = {tester1,tester2,tester3,tester4};

        Developer dev1 = new Developer("yılmaz","Java Developer",4,180000);
        Developer dev2 = new Developer("gunel","Java Master",5,190000);
        Developer dev3 = new Developer("pinar","Software Developer",6,200000);
        Developer dev4 = new Developer("hakim","Senior Developer",8,99000);

        Developer[] developersArray = { dev1,dev2,dev3,dev4};

        ScrumTeam scrum = new ScrumTeam("Nadir","Adam","Asia",14);
        //scrum.addTester(tester1);
        scrum.addTesters(testerArray);
        //scrum.addDeveloper(dev1);
        scrum.addDevelopers(developersArray);
        System.out.println(scrum);

        System.out.println("-------------------------------------------------------");
        for (Tester each: scrum.testerList) {
            System.out.println(each.name + " " + each.salary);
        }

        System.out.println("-------------------------------------------------------");

        for (Developer developer : scrum.devopsList) {
            System.out.println(developer.name+" "+ developer.salary);
        }

        System.out.println("-------------------------------------------------------");
        scrum.removeTester(2);
        scrum.removeDeveloper(dev3.employeeID);
        scrum.removeDeveloper(scrum.devopsList.get(2).employeeID);
        System.out.println(scrum);

    }
}
