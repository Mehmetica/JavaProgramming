package day_33_Statics;

public class Employee_Objects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name="Ahmet";
        employee1.salary =250000;

        Employee employee2 = new Employee();
        employee2.name="Aygun";
        employee2.salary =150000;

        Employee employee3 = new Employee();
        employee3.salary =350000;
        employee3.name ="Fady";//last one will be assigned to the static variable of the class

        System.out.println("employee1 = " + employee1.name);//Fady ,when the name variable is declared as static
        System.out.println("employee2 = " + employee2.name);//Fady
        System.out.println("employee3 = " + employee3.name);//Fady

        System.out.println("-----------------------");
        System.out.println("employee1.salary = " + employee1.salary);// as long as salary is static, last value will be printed
        System.out.println("employee2.salary = " + employee2.salary);
        System.out.println("employee3.salary = " + employee3.salary);


    }
}
