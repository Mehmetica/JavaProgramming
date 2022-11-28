package day_32_CustomClass_Constructors;

public class Employee {
    public String name;
    public char gender;
    public String title;
    public double salary;


    public Employee(String name) {
        this.name = name;
    }
    public Employee(String name, char gender) {//constructor overloading
       // this.name = name; yukarda zaten bu consructor
        // method yazildigi icin tekrar yazmamak icin söyle yapiyoruz:(don't repeat the code fragment)
        this(name);//bir constructor icinde baska bir constructor boyle cagirilir.
        //normal method cagirsaydik Employee(name); derdik. ama constructor is a special method
        this.gender=gender;
    }

    public Employee(String name, char gender , String title) {//constructor overloading
        this(name, gender);//bir onceki constructor metodunu cagirdik
        this.title =title;
    }

    public Employee(String name, char gender , String title,double salary) {//constructor overloading
        this(name, gender, title);
        this.salary=salary;
    }





    public String toString() {
        return "Empoyee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}
