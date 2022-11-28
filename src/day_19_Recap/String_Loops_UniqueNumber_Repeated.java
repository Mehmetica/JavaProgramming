package day_19_Recap;

import java.util.Scanner;

public class String_Loops_UniqueNumber_Repeated {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
//        int count = 0;//girilen stringin içinbde hangi harf kaç kere tekrar etmiş
//        String out = "";
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            for (int j = i + 1; j < str.length(); j++) {
//                if (ch == str.charAt(j))
//                    count++;
//            }
//            if (out.contains(""+ch))
//                continue;
//            out += ""+str.charAt(i)+"-"+count+" . " ;
//
//        }
//
//        System.out.println(out);

        //----------lastindexof kullanmadan verilen sstring içinde unique harfi bul-----------------------------------------------

        String resultUnique = "", repeated = "";

        for (int i = 0; i < str.length(); i++) {//aasdd -
            char ch1 = str.charAt(i);
            int count = 0;//  a
            for (int j = 0; j < str.length(); j++) {//j=1  asdd j=2
                char ch2 = str.charAt(j);           //a
                if (ch1 == ch2) {                   //false
                    count++;
                }
            }
            if (count == 1) {
                resultUnique += ch1;
            }
            if (count != 1) {
                if (repeated.contains("" + ch1)) {
                    continue;
                } else {
                    repeated += ch1;
                    repeated += count;
                }
            }
        }
        System.out.println(repeated);
        System.out.println(resultUnique);


    }
}
