package day_29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Ahmed","Daniel","Aeron","Ahmed","David","Shay"));

        employees.retainAll(Arrays.asList("Ahmed","David"));//Ahmed ve David dışındaki elemanlar silinecek
        System.out.println(employees);
        System.out.println("-------------------------");
//büyük M harfiyle başlayan isimleri sil
        String[] names = {"Marry","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(names));//array->arrayList converted
        list.removeIf(p->p.charAt(0)=='M');

        names=list.toArray(new String[0]);//arrayList -> array converted
        System.out.println(Arrays.toString(names));


    }
}
