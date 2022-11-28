package day_09_IfStatements;

public class Mın_Max_Number_Task {
    public static void main(String[] args) {
        int a=15,b=43;

        if (a>b)
            System.out.println(a+" is greater than "+ b+ " so, "+ a +" is the max number and "+b+ " is the min number");
        else if(b>a)
            System.out.println(b+" is greater than "+ a+ " so, "+ b +" is the max number and "+a+ " is the min number");
        else
            System.out.println(a+" and "+b+ " are equals!");



    }
}
