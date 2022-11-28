package day_36_Inheritance_Intro.EmployeeTask;

public class Employee {
    public String name, jobTitle, companyName;
    public  char gender;
    public int age, ID ;
    public double salary;

    public void work(){
        System.out.println(name+ " is working");
    }

    public void setInfo(String name, String jobTitle, String companyName, char gender, int age, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.salary = salary;
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
