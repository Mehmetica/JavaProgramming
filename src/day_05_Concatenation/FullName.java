package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName="Mehmet";
        String lastName="Gezer";
        int age =34;
        String jobTitle ="SDET";
        String companyName="Apple Inc.";
        double salary = 2055584.45;

        String fullName = firstName +" "+ lastName;
        System.out.println("Full name of the person is: "  + fullName);
        System.out.println(fullName+" is "+age+" years old.");
        System.out.println(fullName+ " is "+jobTitle+" and works in "+companyName+"with a salary of: $"+salary);




    }
}
