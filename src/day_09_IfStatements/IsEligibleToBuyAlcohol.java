package day_09_IfStatements;

public class IsEligibleToBuyAlcohol {
    public static void main(String[] args) {
        String name="Mehmet";
        int age=23;
        String citizen= "TR";

        if (age>18 && citizen!="TR"){
            System.out.println(name+ " is eligible to buy alcohol.");
        }
        else
            System.out.println(name+ " is NOT eligible to buy alcohol.");



    }
}
