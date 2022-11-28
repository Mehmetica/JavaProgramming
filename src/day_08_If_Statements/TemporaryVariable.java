package day_08_If_Statements;

public class TemporaryVariable {
    public static void main(String[] args) {
        int a=10;
        int b=15;
int temp=b;//b değeri b=a yapınca kaybolacak.biz daha sonra bu b değerini kullanmak istiyorsak geçici bir degere atama yaparız.
        b=a;
        a=temp;

        System.out.println("a = " + a);//15
        System.out.println("b = " + b);//10


    }
}
