package day_37_Inheritance.ScrumTeam;

public class Employee extends Person {
    public int ID;
    public double salary;
    public String jobTitle;

    public Employee(String name, int age, char gender, int ID, double salary, String jobTitle) {
        super(name, age, gender);
        this.ID = ID;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void work() {
        System.out.println(name+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
