package day_10_NestedIf_Ternaries;

public class Ternaries {
    public static void main(String[] args) {

        int a = 10, b = 22, max;

        if (a > b)
            max = a;
        else max = b;

        System.out.println("max = " + max);

        System.out.println("-------------------------------");

        int maxTernar = (a > b) ? a : b;  // ? --> if ,  : --> else , :(fsfsd)? else if
        //dönen tüm değerler aynı cinsten ise ternary kullanılabilr.

        System.out.println("maxTernar = " + maxTernar);

        System.out.println("------------------------------");
        int score = 85;
        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
        System.out.println("grade = " + grade);


    }
}
