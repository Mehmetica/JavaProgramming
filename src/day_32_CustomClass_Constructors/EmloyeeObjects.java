package day_32_CustomClass_Constructors;

public class EmloyeeObjects {
    public static void main(String[] args) {
        Employee employee = new Employee("Mehmet");
        Employee employee2 = new Employee("Mehmet",'M');
        Employee employee3 = new Employee("Mehmet",'M',"SDET");
        Employee employee4 = new Employee("Mehmet",'M',"DEV",150000);

        System.out.println("empoyee = " + employee);
        System.out.println("empoyee2 = " + employee2);
        System.out.println("employee3 = " + employee3);
        System.out.println("employee4 = " + employee4);


    }

}
