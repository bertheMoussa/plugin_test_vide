package plugin_test;

import java.util.Arrays;

public class InefficientSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 4, 1};
        inefficientSort(array);
        System.out.println("Inefficient Sort: " + Arrays.toString(array));
        
        int n = 10; // Example for factorial calculation
        System.out.println("Factorial of " + n + " is " + factorial(n));
        
        int[] bubbleArray = {5, 3, 2, 4, 1};
        bubbleSort(bubbleArray);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleArray));
        
        int[] sumArray = {5, -3, 2, 4, -1};
        int maxSum = maxSubArraySum(sumArray);
        System.out.println("Max Subarray Sum: " + maxSum);
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

    // Factorial calculation using recursion
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Bubble sort algorithm
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // Maximum subarray sum using O(n^2) approach
    public static int maxSubArraySum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int currentSum = 0;
            for (int j = i; j < array.length; j++) {
                currentSum += array[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}
