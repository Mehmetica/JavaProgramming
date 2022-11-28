package day_20_Arrays;
//1. create an array named classmates, and store 10 of your classmates' full names
//            print the initials of each classmates in separate lines
import java.util.Scanner;
import java.util.Arrays;
public class TasksInitials {
    public static void main(String[] args) {
        String [] classMates = new String[10];
        Scanner scan = new Scanner(System.in);
        String [] initials = new String[10];
        for (int i = 0; i <10 ; i++) {
            System.out.print((i+1)+". classmate's full name: ");
            classMates[i]= scan.nextLine();
             initials[i]= ""+classMates[i].charAt(0)+classMates[i].charAt(classMates[i].indexOf(' ')+1);


        }
     for (String each : initials)
         System.out.println(each);



    }
}
