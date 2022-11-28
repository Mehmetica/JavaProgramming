package day_26_CustomMethodsPractice;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));


    }

    public static int[] uniqueElements(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (FrequencyOfElement.findFrequency(array, each) == 1) {
                result = FrequencyOfElement.addElement(result, each);

            }
        }

        return result;
    }
}
