package day_37_Inheritance.ScrumTeam;

import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {
        ProductOwner productOwner = new ProductOwner("John",41,'M',3026,120000,"Product Owner","Amazon");
        ScrumMaster scrumMaster = new ScrumMaster("Mike",39,'M',3025,100000,"Scrum Master");
        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Ruyanda",35,'F',3024,150000,"Business Analyst","Amazon");

        Tester tester1 = new Tester("Mehmet",34,'M',2020,120000,"Full stack tester","Amazon");
        Tester tester2 = new Tester("Cemil",32,'M',2021,130000,"API tester","Amazon");
        Tester tester3 = new Tester("Lokman",42,'M',2022,140000,"Frontend QA","Amazon");
        Tester tester4 = new Tester("Günel",35,'F',2023,150000,"Backend QA","Amazon");

        Developer developer1 = new Developer("Baho",35,'M',1020,150000,"Backend Dev");
        Developer developer2 = new Developer("HKM",43,'M',1021,160000,"Frontend Dev");
        Developer developer3 = new Developer("Busra",19,'F',1022,170000,"Fullstack Dev");
        Developer developer4 = new Developer("Yilmaz",29,'M',1023,180000,"Backend Dev");
        Developer developer5 = new Developer("Mustafa",29,'M',1024,180000,"Backend Dev");

        ScrumTeam scrumTeam = new ScrumTeam();

        Tester[] tester = new Tester[]{tester1,tester2,tester3,tester4};
        scrumTeam.addTesters(tester);

        Developer[] developers = new Developer[]{developer1,developer2,developer3,developer4,developer5};
        scrumTeam.adddevelopers(developers);

        scrumTeam.PO = productOwner;
        scrumTeam.SM = scrumMaster;
        scrumTeam.BA= businessAnalyst;

        System.out.println(scrumTeam);












    }
}
