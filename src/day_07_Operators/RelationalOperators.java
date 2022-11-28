package day_07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        boolean result = 45 <= 50;
        System.out.println("result = " + result);//true

        int score = 59;
        boolean hasFailed = score < 60;
        System.out.println("hasFailed = " + hasFailed);//true

        int num1 = 90, num2 = 90;
        boolean isEqulas = num1 == num2;
        System.out.println("isEqulas = " + isEqulas);//true
        int num3 = 98;
        isEqulas = num1 == num3;
        System.out.println("isEqulas = " + isEqulas);//false

        System.out.println("-----------------------------------");
        boolean result2= "memet"=="ahmet";//false
        System.out.println("result2 = " + result2);
        boolean result3= 'a'=='A';//false
        System.out.println("result3 = " + result3);

        boolean result4= "ali" == " ali     ";//arada boşluk var.aynı değiller
        System.out.println("result4 = " + result4);

        System.out.println("---------------------------");

        boolean result5= 32!=34;
        System.out.println("result5 = " + result5);//true

        //boolean result6= "a" == 'a';//farkı variable type ları karşılaştıramazsın


    }
}
