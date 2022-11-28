package day_09_IfStatements;

public class NameOfTheMonths {
    public static void main(String[] args) {
        int input = 10; // should be entered between 1-12
        String month = null;

            if (input == 1) {
                month = "January";
            } else if (input == 2) {
                month = "February";
            } else if (input == 3) {
                month = "March";
            } else if (input == 4) {
                month = "April";
            } else if (input == 5) {
                month = "May";
            } else if (input == 6) {
                month = "Jun";
            } else if (input == 7) {
                month = "July";
            } else if (input == 8) {
                month = "August";
            } else if (input == 9) {
                month = "September";
            } else if (input == 10) {
                month = "October";
            } else if (input == 11) {
                month = "November";
            } else if (input == 12) {
                month = "December";
            }
            System.out.println("The month is = " + month);




    }
}
