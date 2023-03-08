package Tests;
import Sorts.SelectionSort;
import org.junit.Assert.*;
import org.junit.Test;

/**
 * Use this class to test all methods that are used in our Selection Sort Algorithm
 */
public class SelectionSortTests {

    /**
     * Test findSmallest method for our Selection Sort
     */
    @Test
    public void testFindSmallest(){
        int[] input = new int[]{10,2,6,8,34};
        int expected = 1;

        int actual = SelectionSort.findSmallest(input,0);
        org.junit.Assert.assertEquals(actual, expected);

    }

    @Test
    public void testSwap(){
        int[] input = new int[]{2,4,8,6,10};
        int[] expected = new int[]{2,4,6,8,10};

        SelectionSort.swap(input,2,3);
        org.junit.Assert.assertArrayEquals(input, expected);
    }

}
