package day_37_Inheritance.ScrumTeam;

public class Tester extends  Employee{
    public String product;

    public  void findBug(){
        System.out.println(name+" is validating "+product);
    }

    public Tester(String name, int age, char gender, int ID, double salary, String jobTitle, String product) {
        super(name, age, gender, ID, salary, jobTitle);
        this.product = product;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "product='" + product + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
