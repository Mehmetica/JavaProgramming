package day_25_CustomMethods_Overloading;

public class FindMaxLongArray {
    public static void main(String[] args) {
        long [] arr= {1321546,7986541,1234567891,354549897,999999999,9223372036854775807L};

        System.out.println(findmax(arr));


    }public static long findmax(long[] a){
        long max=0;
        for (long each:a) {
            if (each>max)
                max=each;
        }
        return max;
    }
}
