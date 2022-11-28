package day_19_Recap;

import day_12_Scanner.ScannerEx;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = scan.nextInt();
        System.out.print("operator + or - :");
        char op = scan.next().charAt(0);
        if (! ( op=='+' || op =='-')){
            System.err.println("invalid operator");
            System.exit(0);
        }
        System.out.print("num2: ");
        int num2= scan.nextInt();
        if (op=='+')
        System.out.println("total: "+num2+num1);
        else System.out.println("sunstract: "+(num1-num2));
    }
}
