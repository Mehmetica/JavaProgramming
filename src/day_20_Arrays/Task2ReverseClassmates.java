package day_20_Arrays;
//2. create string array, and store the names of your  class mates (10)
//            reverse each students names and print them in separate lines
//            	ex:
//            		arr = {java, python, c#}
//
//        		output:
//        			avaJ
//        			nohtyp
//        			#c

import java.util.Scanner;

public class Task2ReverseClassmates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] classmates = new String[2];
        String[] reverse = new String[10];
        String rev = "";
        for (int i = 0; i < classmates.length; i++) {
            System.out.print("Please enter your " + (i + 1) + ". classmate's first name: ");
            classmates[i] = scan.next();//ali

            for (int j = classmates[i].length() - 1; j >= 0; j--) {
                rev += "" + classmates[i].charAt(j);
            }
            reverse[i] = rev;
            rev = "";


        }
        for (String i : reverse)
            System.out.println(i);


    }
}
