package day_27_Wrapper_Class;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";
        int i = Integer.parseInt(str);//parseInt metodu primitive data döndürür.

        System.out.println(i + 1);//124

        String str2 = "10.5";
        double d1 = Double.parseDouble(str2);//Double wrapper class tan parse metodunu
        // cagirdik ve bize double primitive data tipi dondurdu
        System.out.println(d1);//10.5

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println(Double.MAX_VALUE);

        String s1 = "true";
        boolean b1 = !Boolean.parseBoolean(s1);
        //parse--> String->returns primitive
        System.out.println(b1);//false

        String s2 = "123456";
        int i2 = Integer.valueOf(s2);//Integer
        //valuOf--> String->returns Wrapper class
        System.out.println(i2);

        String s3 = "456.456";
        double d3 = Double.valueOf(s3);
        System.out.println(d3);

        System.out.println("------------------");

        //Character wrapper class has more methods than other wrapper classes

        //isDigit()

        char ch1 = '0';
        boolean r2 = Character.isDigit(ch1);//is between 1-9?
        System.out.println(r2);//false this is a letter
        //isletter()
        boolean r3 = Character.isLetter(ch1);
        System.out.println("r3 = " + r3);//false

        //specialchar?
        char ch2 = '!';
        boolean r4 = !Character.isLetterOrDigit(ch2);// not a letter or not a digit?
        System.out.println("r4 = " + r4);

        //uppercase
        char ch3 = 'A';
        boolean r5 = Character.isUpperCase(ch3);//true
        boolean r6 = Character.isLowerCase(ch3);//false
        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);

        System.out.println("-----------");

        String s = "ab1asda2sdffg3sgre4";

        int sum = 0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt(""+each);
                //s String inin içindeki char olarak bekleyen sayıların toplamını alacağız.
                //önce s i char array ine çevirdik
                // tek tek digit mi diye kontrol ettik
                //eğer digit ise toplama eklemek istedik ancak each element bir char dı.
                //önce her char elemanı ""+ ile String e çevirdik
                //parseInt metoduyla String i Integer yaptık ve toplama yaptık
            }
        }
        System.out.println("sum = " + sum);

        System.out.println("-------------------------");







    }
}
