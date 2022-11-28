package day_18_NestedLoops;

import day_12_Scanner.ScannerEx;

import java.util.Scanner;

public class nested2 {
    public static void main(String[] args) {
//        while (true) {
        Scanner scan = new Scanner(System.in);
//            System.out.print("enter 1. number: ");
//            int num1 = scan.nextInt();
//            System.out.print("enter 2. number: ");
//            int num2 = scan.nextInt();
//            System.out.println(num1 + num2);
//            System.out.println("re enter ?");
//            String answer = scan.next();
//            while (! ((answer.equals("yes") || (answer.equals("no"))))) {
//                System.out.println("re-try!");
//                answer = scan.next();
//            }
//            if (answer.equals("no"))
//                break;
//        }
        ///-------------------------------------------------------------------------
//        while (true) {
//            System.out.print("enter your  age: ");
//            int age = scan.nextInt();
//            while (!((age >= 1) && (age <= 120))) {
//                System.err.println("invalid entry! re-try");
//                age = scan.nextInt();
//
//            }
//            System.out.println("continue?");
//            String answer = scan.next();
//            while (!(answer.equals("yes") || answer.equals("no"))) {
//                System.out.println("invalid answer, please re-try!");
//                answer= scan.next();
//            }
//            if (answer.equals("no")){
//                System.out.println("you exited!");
//                break;
//            }
//        }
//            scan.close();
        //------------------------------------------------------------------------------
//        while (true) {
//            System.out.print("please enter number: ");
//            int num1 = scan.nextInt();
//            if (num1 % 2 == 0) {
//                System.out.println("even number");
//            } else System.out.println("odd number");
//            System.out.println("would you like to do it again?");
//            String answer = scan.next();
//            while (!(answer.equals("yes") || answer.equals("no"))) {
//                System.err.println("invalid entry,re-try!");
//                answer = scan.next();
//            }
//            if (answer.equals("no"))
//                break;

    //---------------------------------------------------------------------
        for (int i = 1; i <6 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}

