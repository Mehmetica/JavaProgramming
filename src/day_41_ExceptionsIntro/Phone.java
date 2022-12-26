package day_41_ExceptionsIntro;

public class Phone {
    static int number;

    public Phone() {
        number += 1;
    }

    public Phone(int num) {
        this();
        number += num;
    }

    public Phone(String str) {
        this(str.length());
    }


}

class Test {

    public static void main(String[] args) {
        new Phone("iphone");
        new Phone();
        new Phone(4);
        System.out.println(Phone.number);
    }
}
