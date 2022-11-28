package day_30_CustomClass;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee Employee1 = new Employee();
        Employee Employee2 = new Employee();
        Employee Employee3 = new Employee();
        Employee Employee4 = new Employee();
        Employee Employee5 = new Employee();

        Employee1.setInfo("mehmet",45645,'M',"Manager",90000,true);
        Employee2.setInfo("ahmet",123,'M',"Dev",40000,true);
        Employee3.setInfo("fatma",789,'F',"QA",50000,false);
        Employee4.setInfo("hatice",564,'F',"QA",65000,true);
        Employee5.setInfo("ömer",456456,'M',"Dev",70000,false);Employee1.setInfo("mehmet",45645,'M',"Manager",90000,true);

        Employee[] employees= {Employee1,Employee2,Employee3,Employee4,Employee5};
        int countFullTime=0;
        int countPartTime=0;

        double max= employees[0].salary;
        double min= employees[0].salary;

        for (Employee each : employees) {
            if (each.isFullTime)
                countFullTime++;
            else countPartTime++;

            if (each.salary>max)
                max=each.salary;

            if (each.salary<min)
                min=each.salary;
        }
        System.out.println("counPartTime = " + countPartTime);
        System.out.println("counFullTime = " + countFullTime);

        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
