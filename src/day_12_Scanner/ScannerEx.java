package day_12_Scanner;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("double: ");
        double dbl = scan.nextDouble();
        System.out.println("integer: ");
        int a = scan.nextInt();
        scan.nextLine();// ÖNEMLİ . If you dont add this nextline method between any
        //other scanner method and nextline method, you get a empty line .Because; after typing for int, we press enter
        // to continue. But , nextline method accepts this enter(empty line) as a line and print as empty.
        //this first (unassigned to no object)nextline method keeps this empty line , doesn't print.
        //So, our 2nd nextline method takes the correct string from the user.
        System.out.println("string: ");
        String str = scan.nextLine();
        System.out.println("a = " + a);
        System.out.println("dbl = " + dbl);
        System.out.println("str = " + str);

        System.out.println("--------------------------------");



    }
}
