package plugin_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Random;

public class InefficientSortTest {

    @Test
    public void testInefficientSort() {
        int size = 10000;  // Adjust this size to make the test more or less expensive
        int[] array = new int[size];
        Random random = new Random();

        // Fill the array with random integers
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }

        // Capture the start time
        long startTime = System.currentTimeMillis();

        // Perform the sort
        InefficientSort.inefficientSort(array);

        // Capture the end time
        long endTime = System.currentTimeMillis();

        // Check if the array is sorted
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue(array[i] <= array[i + 1], "Array is not sorted");
        }

        // Output the time taken for sorting
        System.out.println("Time taken to sort array: " + (endTime - startTime) + " milliseconds");
    }
}