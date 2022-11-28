package day_08_If_Statements;

public class LogicalOperators {
    public static void main(String[] args) {

        int age = 19;
        String name = "Mehmet";
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";//true * true==true
        isEligible = age<18 && citizen =="USA";//false* true==false


        System.out.println(name + " is eligible for vote : " + isEligible);//true

        System.out.println("--------------------------------------");

        char gender='F';
        String name2="Ali";
        int age2 =15;
        boolean isUSCitizen= false;

        boolean isAccepted = age2 >=18 && (name2=="Ali" || gender =='F');//false*(true+true)-->false*true-->false
        boolean isAccepted2 = age2 >=18 && (name2=="Ali" || gender =='M') && isUSCitizen==true;//false*(true+false)*false-->false*true*false-->false
        System.out.println("isAccepted = " + isAccepted);


    }
}
