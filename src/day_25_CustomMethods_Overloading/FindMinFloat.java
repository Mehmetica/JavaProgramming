package day_25_CustomMethods_Overloading;

public class FindMinFloat {
    public static void main(String[] args) {
        float [] arr= {654.798f, 654987.321654f,87987.5645121f};

        System.out.println(findMin(arr));

    }public static float findMin(float[] a ){
        float min= (float)(3.4*Math.pow(10,38));

        for (float each:a) {
            if (each<min)
                min = each;
        }return min;
    }
}
