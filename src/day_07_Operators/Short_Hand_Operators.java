package day_07_Operators;

public class Short_Hand_Operators {
    public static void main(String[] args) {

        String word = "Jav Operator";
        System.out.println("word = " + word);

        word = "Memet";
        System.out.println("word = " + word);

        word= "123"+1;//1231
        System.out.println("word = " + word);

        word=(1+2)+5+"Memo";//8Memo
        System.out.println("word = " + word);

        String str="Mehmet";
        str+=" Gezer";
        System.out.println("str = " + str);// Mehmet Gezer

        //------------------------------------

        double price=100.5;
        int tax=300;

        price+=tax;
        System.out.println("price = " + price);
        System.out.println("---------------------------");
        price*=2;
        System.out.println("price = " + price);

        System.out.println("---------------------------");
        price%=7;
        System.out.println("price = " + price);


    }
}
