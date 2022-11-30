package day_37_Inheritance.ScrumTeam;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int ID, double salary, String jobTitle) {

        super(name, age, gender, ID, salary, jobTitle);
    }

    @Override
    public String toString() {
        return "ScrumMaster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
