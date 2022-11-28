package day_08_If_Statements;

public class GradeReport {
    public static void main(String[] args) {

        int score = 85;


        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 80) {
            System.out.println("Great");
        } else if (score >= 70) {
            System.out.println("Good");
        } else if (score >= 60) {
            System.out.println("Passed");
        } else
            System.out.println("Failed");


    }
}
