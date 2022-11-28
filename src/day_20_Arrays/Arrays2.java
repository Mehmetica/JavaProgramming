package day_20_Arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] names = {"mehmet", "ömer", "hatice" };
        System.out.println(Arrays.toString(names));

        int[] numbers = {1, 2, 3, 4, 5, 9, 8, 5, 4, 7, 1};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        char[] chars = {'s', 'd', 'r', 'w', 'h'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println("-------------------------------------------");
        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'a', 'b', 'c'};
        char[] arr3 = {'b', 'a', 'c'};

        System.out.println(arr1 == arr2);//false. memory deki yerler, farklı
        System.out.println(Arrays.equals(arr1, arr2));//true. each element should be the same. order also.
        System.out.println(Arrays.equals(arr2, arr3));//false. each element should be the same. order also.

        Arrays.sort(arr3);

        System.out.println(Arrays.equals(arr2, arr3));//true
        System.out.println("----------------------------------------");
        int [] scroes = {45,55,65,75,85};
        int [] scores2 = Arrays.copyOf(scroes,8);//scores a ek 3 tene daha yer açtık
        System.out.println(Arrays.toString(scores2));

        int [] scores3 = Arrays.copyOf(scroes,3);//sadece ilk üç elemanını kopyalamak istedik
        System.out.println("scores3: "+Arrays.toString(scores3));
        System.out.println("------------------------------");

        char [] elements = {'a','b','d','e','f',};
        char[] someElements = Arrays.copyOfRange(elements,2,4);//başlangıç ve son noktası belli olan aralığı kopyalar
        System.out.println(Arrays.toString(someElements));







    }
}
