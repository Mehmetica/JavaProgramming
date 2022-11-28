package day_34_Garbage_Collection;

public class Access_Modifier_Test {

    public static void main(String[] args) {
//        System.out.println(Access_Modifiers.publicData);
//        System.out.println(Access_Modifiers.defaultData);
        //    System.out.println(Access_Modifiers.privateData); non-reachable outside the class
        System.out.println("---------başka bir konu-----------------------");
        int sayi = 45;
        String sayi1 = String.valueOf(sayi);
        String sayi2 = Integer.toString(sayi);
        String sayi3 = sayi + " ";

        String s = "12";
        int a = Integer.parseInt(s);
        Integer b = Integer.valueOf(s);

        System.out.println(a);
        System.out.println(b);

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("sayi3 = " + sayi3);
    }
}
