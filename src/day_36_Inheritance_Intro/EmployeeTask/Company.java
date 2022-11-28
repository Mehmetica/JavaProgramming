package day_36_Inheritance_Intro.EmployeeTask;

public class Company {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.setInfo("John","QA","Amazon",'M',34,3026,250000);
        System.out.println(tester); 
        
        Developer developer = new Developer();
        developer.setInfo("Mark","FrontEndDev","Microsoft",'M',37,3022,150000);
        System.out.println(developer);
        System.out.println();
        
        





    }
}
