package day_30_CustomClass;

import java.sql.DataTruncation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    //1-change first and last element the arrayList
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        Collections.swap(list,0,list.size()-1);

        System.out.println(list);//[5, 2, 3, 4, 1]

        System.out.println("------------------------------------------------------");
        //2-Write a program that can move all the zeroes to the last indexes of an
        // arrayList

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0,5,0));

        int size = list2.size();
        list2.removeAll(Arrays.asList(0));
        System.out.println(list2);

        int newSize = list2.size();

        int totalNumberOfZeroes = size-newSize;
        System.out.println("totalNumberOfZeroes = " + totalNumberOfZeroes);

        for (int i = 0; i <totalNumberOfZeroes ; i++) {
            list2.add(0);
        }
        System.out.println("list2 = " + list2);
        System.out.println("------------------------------------------------------");
        //3- bir array list i ayıkla ve elemanların cinsine göre arraylistler oluştur

        String str = "ABCD123^+&%&/456EFG!";
        ArrayList<Character> mixedList = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {//String bir değişkeni direk bir character
            // list e çeviremeyiz, manuel yapmalıyız.String bir list e direk parantez
            // içinde yazarak dönüştürebilirdik
            mixedList.add(str.charAt(i));
        }
        System.out.println("mixedList = " + mixedList);

        ArrayList<Character> letters = new ArrayList<>(mixedList);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println("letters = " + letters);

        ArrayList<Character> numbers = new ArrayList<>(mixedList);
        numbers.removeIf(p-> !Character.isDigit(p));
        System.out.println("numbers = " + numbers);

        ArrayList<Character> special = new ArrayList<>(mixedList);
        special.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println("special = " + special);

    }
}
