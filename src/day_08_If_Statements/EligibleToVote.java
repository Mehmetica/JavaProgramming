package day_08_If_Statements;

public class EligibleToVote {
    public static void main(String[] args) {


        String Name = "Mehmet";
        int age = 34;
        String citizen = "USA";
        boolean isEligible = age >= 21 && citizen == "USA";//true

        if(isEligible){//if isEligible is true, then this if blog will work
            System.out.println("Eligible");
        }
        if (!isEligible){//if isEligible is false(!true==false), then this if blog will work
            System.out.println("Not Eligible");
        }



    }
}
