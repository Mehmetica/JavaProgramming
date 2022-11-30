package day_37_Inheritance.ScrumTeam;

public class ProductOwner extends Employee{
    public  String product;

    public ProductOwner(String name, int age, char gender, int ID, double salary, String jobTitle, String product) {
        super(name, age, gender, ID, salary, jobTitle);
        this.product = product;
    }

    @Override
    public String toString() {
        return "BusinessAnalyst{" +
                "product='" + product + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    void gathering(){
        System.out.println(name+ " is gahtering requeriments about "+product);
    }
}

