package day_25_CustomMethods_Overloading;

public class MaxNumberOfAnArray {
    public static void main(String[] args) {
        double[] arr1 = {1.1,2.2,3.3,4.4};

        System.out.println(findMax(arr1));



    }
    public static double findMax(double[] a){

        double max =0;
        for (double each:a) {
            if (each>max){
                max=each;
            }
        }
        return max;

    }
}
