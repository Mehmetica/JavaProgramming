package day_27_Wrapper_Class;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Your password must match these conditions: ");
        System.out.println("1. Password MUST be at least have 8 characters long, and should not contain space");
        System.out.println("2. PassWord should at least contain one upper case letter");
        System.out.println("3. PassWord should at least contain one lower case letter");
        System.out.println("4. Password should at least contain one special characters");
        System.out.println("5. Password should at least contain a digit");
        System.out.print("Please enter a password: ");
        String password = scan.next();


        boolean hasMin8 = false;
        boolean hasBlank = false;
        boolean has1Upper = false;
        boolean has1Lower = false;
        boolean has1Special = false;
        boolean has1Digit = false;

        if (password.length() >= 8) {
            hasMin8 = true;
        }
        char[] arrayPassword = password.toCharArray();
        int count = 0;

        for (char each : arrayPassword) {

            if (Character.isUpperCase(each)) {
                count++;
            }
        }
        if (count >= 1) has1Upper = true;
        count = 0;

        for (char each : arrayPassword) {

            if (Character.isLowerCase(each)) {
                count++;
            }
        }
        if (count >= 1) has1Lower = true;
        count = 0;

        for (char each : arrayPassword) {

            if (!Character.isLetterOrDigit(each)) {
                count++;
            }
        }
        if (count >= 1) has1Special = true;
        count = 0;

        for (char each : arrayPassword) {

            if (each == ' ') {
                count++;
            }
        }
        if (count == 0) hasBlank = true;
        count = 0;

        for (char each : arrayPassword) {

            if (!Character.isDigit(each)) {
                count++;
            }
        }
        if (count >= 1) has1Digit = true;

        if (hasMin8 == false || hasBlank == false || has1Upper == false || has1Lower == false || has1Special == false || has1Digit == false) {
            System.out.println("Invalid password please try again!");

        } else System.out.println("Your password is set!");
    }


}

