package day_36_Inheritance_Intro.EmployeeTask;

public class Employee {
    public String name, jobTitle, companyName;
    public  char gender;
    public int age, ID ;
    public double salary;

    public void work(){
        System.out.println(name+ " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }
}
