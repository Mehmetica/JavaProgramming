package day_30_CustomClass;

public class Employee {//Employee custom class is an entity that determines what an object
    // will contain(instance variables or attributes) and how an object will
    // behave(actions, methods)
//instance variables
    String name;
    int ID;
    char gender ;
    String jobTitle;
    double salary;
    boolean isFullTime;
//constructor
    public void setInfo(String name, int ID, char gender, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }
//print method
    public String toString() {
        return "Emloyee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public  void  work(){
        System.out.println(jobTitle+" "+name+" is working");
    }
    // we have 7 attributes and 3 actions here



}
