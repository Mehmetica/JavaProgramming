package day_34_Garbage_Collection;

public class Access_Modifiers {
    public static int publicData = 100;
    static int defaultData = 200;//access modifer is default
    private static int privateData = 300;

    public static void main(String[] args) {

        System.out.println("publicData = " + publicData);
        System.out.println("privateData = " + privateData);
        System.out.println("defaultData = " + defaultData);


    }

}
