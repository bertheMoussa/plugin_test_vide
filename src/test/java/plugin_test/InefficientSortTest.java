package plugin_test;

import org.junit.Test;
import static org.junit.Assert.*;

public class InefficientSortTest {

    @Test
    public void testInefficientSort() {
        int[] array = {5, 3, 2, 4, 1};
        InefficientSort.inefficientSort(array);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, InefficientSort.factorial(0));
        assertEquals(1, InefficientSort.factorial(1));
        assertEquals(2, InefficientSort.factorial(2));
        assertEquals(6, InefficientSort.factorial(3));
        assertEquals(24, InefficientSort.factorial(4));
        assertEquals(120, InefficientSort.factorial(5));
    }

    @Test
    public void testBubbleSort() {
        int[] array = {5, 3, 2, 4, 1};
        InefficientSort.bubbleSort(array);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testMaxSubArraySum() {
        int[] array1 = {5, -3, 2, 4, -1};
        assertEquals(8, InefficientSort.maxSubArraySum(array1));

        int[] array2 = {-2, -3, 4, -1, -2, 1, 5, -3};
        assertEquals(7, InefficientSort.maxSubArraySum(array2));

        int[] array3 = {-1, -2, -3, -4};
        assertEquals(-1, InefficientSort.maxSubArraySum(array3));  // Best of the negative numbers is -1
    }
}
