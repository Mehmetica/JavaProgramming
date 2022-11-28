package day_09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 80;
        char grade;

        if (score >= 90 && score<=100) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
            System.out.println("Your grade is: " + grade + " and you FAİLED!!!");
        }
        System.out.println("Your grade is: " + grade + " and you PASSED!!!");




    }
}

