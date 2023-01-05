package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
//-----------------------impicit testing --------automatic-----------
        //double->float->long->int->short->byte
        byte a = 100;
        short b =a;//(short)a arka planda casting yapıyır. küçük değer büyüğe girdiği için sıkıntı yok.implicit casting
        int c=b;//(int)b smaller primitive types can be assigned to bigger primitive types.

//----------------Explicit CAsting--------manuel------------
//assigning larger types to smaller types.you cannot do it automatically. you have to do it manually

        int x =55;
        byte byt = (byte)x; //açık döküm.manuel casting

        long lo= 1000_000;
        short sh = (short)lo;
        byte bb =(byte)lo;
        System.out.println(lo+": "+bb);//1000000 is not within the range of byte.so it gives different type of calculating byte value.


        float fl= 12.58f;
        double doub =  fl;
        int in= (int) fl;//floatı inte zorla soktuk.
        System.out.println(fl+" : "+in);//it only takes int part of the float. deletes after dot. 12.58-->12






    }
}
