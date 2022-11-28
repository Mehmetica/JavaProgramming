package day_36_Inheritance_Intro.EmployeeTask;

public class Developer extends Employee{
    public  void developing(){
        System.out.println(name + " is developing");
    }
    @Override
    public void setInfo(String name, String jobTitle, String companyName, char gender, int age, int ID, double salary) {
        super.setInfo(name, jobTitle, companyName, gender, age, ID, salary);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
