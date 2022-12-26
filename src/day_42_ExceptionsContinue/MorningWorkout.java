package day_42_ExceptionsContinue;

import java.util.Scanner;

public class MorningWorkout {
    public static void main(String[] args) {
        System.out.println("Push ups started");

        for (int i = 1; i <=30 ; i++) {

            System.out.print("\rPush up "+ i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nPush ups completed");

//timer method
//        System.out.println("-------------------------------");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Minutes?: ");
//        int minute = scanner.nextInt();
//        for (int i = minute; i >0 ; i--) {
//            for (int j = 59; j >=0 ; j--) {
//                System.out.print("\r"+(i-1)+" minutes "+ j + "seconds left");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        System.out.println("\nCount down finished");

        System.out.println("Pull ups started");
        for (int i = 1; i <=20 ; i++) {
            System.out.print("\rPull ups "+ i);
            sleep(2.5);
        }
        System.out.println("\nPull ups finished");




    }
    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
