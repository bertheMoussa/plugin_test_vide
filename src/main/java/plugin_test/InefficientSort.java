package plugin_test;

import java.util.Arrays;

public class InefficientSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 4, 1};
        inefficientSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void inefficientSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
