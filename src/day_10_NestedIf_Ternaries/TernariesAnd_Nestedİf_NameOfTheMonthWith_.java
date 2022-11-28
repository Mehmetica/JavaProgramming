package day_10_NestedIf_Ternaries;

public class TernariesAnd_Nestedİf_NameOfTheMonthWith_ {
    public static void main(String[] args) {
        int number = 13;
        String result = "";//if blogunun sonundaki yazdırma satırında hata vermemesi icin temporary değer veriyoruz

        if (number >= 1 && number <= 12) {
            if (number == 1) //if den sonra sadece bir tane statement varsa curly brachlet kullanmak zorunlu degil
                result = "Jan";
            else if (number == 2) {
                result = "Feb";
            }
            else if (number == 3) {
                result = "March";
            }
            else if (number == 4) {
                result = "Apr";
            }
            else if (number == 5) {
                result = "May";
            }
            else if (number == 6) {
                result = "Jun";
            }
            else if (number == 7) {
                result = "July";
            }
            else if (number == 8) {
                result = "Agst";
            }
            else if (number == 9) {
                result = "Sept";
            }
            else if (number == 10) {
                result = "Oct";
            }
            else if (number == 11) {
                result = "Nov";
            }
            else  {
                result = "Dec";
            }


        } else {
            result = "Invalid";
        }
        System.out.println(result);
        System.out.println("------------terneries----------------------------------------");

        String str = (number == 13) ? "January13" : (number == 14) ? "January14": "else";//tek değer ve tek tip
        // döndürebilir ternaries. ve ? sayısıyla : sayısı eşit olmalı. parantez zorunlu değil ama okunabilirlik açısından koy.
        System.out.println("str = " + str);

        System.out.println("---------------TernariesWithNested----------------------");

        int s=85;
//        if (s>=0 && s<=100){
//            if (s>=60)
//                System.out.println("Passed");
//            else System.out.println("Failed");
//        }else System.out.println("Invalid");

        String result_ter=(s>=0 && s<=100)? (s>=60)? "Passed" :"Failed" :"Invalid score";//yukardakinin ternari versiyonu
        System.out.println("result_ter = " + result_ter);
        System.out.println("-------------------------------------------");
        int ter2= 615;
        String result_ter2= (ter2>=0 && ter2<=100)? (ter2>=90)? "Excellent" : (ter2>=80)? "Great" : (ter2>=70)? "Good":
                (ter2>=60)? "Passed" : "Failed" : "Invalid";//son : else kısmı ilk baştaki if e ait.
        System.out.println("result_ter2 = " + result_ter2);// ternari okuması,yanlışları düzeltmesi daha zordur.nested if ler
        // daha kolay






    }
}
