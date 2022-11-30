package day_37_Inheritance.ScrumTeam;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, int ID, double salary, String jobTitle) {
        super(name, age, gender, ID, salary, jobTitle);

    }

    @Override
    public String toString() {
        return "Developer{" +

                ", ID=" + ID +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void area(){
        System.out.println(name +" is working on ");
    }
}
