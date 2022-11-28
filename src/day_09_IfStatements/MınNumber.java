package day_09_IfStatements;

public class MınNumber {
    public static void main(String[] args) {
        int num1=25,num2=58;
        boolean num1isMin= num1<num2;
        boolean num2isMin= num1>num2;
        boolean isEqual= num1==num2;

            if (num1isMin){
                System.out.println(num1+" is the min number");
            }
            if (num2isMin){
                System.out.println(num2+" is the min number");
            }
            if (isEqual)
                System.out.println(num1+" and "+ num2+" are equal");



    }
}
