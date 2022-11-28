package day_33_Statics;
//when we declare a instance variable, every object we created from that class can have
// that field(instance variable)
//But when we want a variable cannot be changed, have only one value, we create it as static.
//Student custom class has a instance variable as "name", but has a static variable as
// "school name" because school name has only one value, shouldn't be changed
public class Employee {

    public  String name;
    public    double salary;
    public static boolean isHuman = true;

}
