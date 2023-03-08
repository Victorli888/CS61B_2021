package Tests;

import Sorts.SelectionSort;
import org.junit.Assert;
public class SortingTest {
    int[] a = new int[] {1,2,3,4,5};
    int[] b = new int[] {5,4,3,2,1};
    int[] c = new int[] {5,1,2,4,3};
    int[] expected = new int[] {1,2,3,4,5};

    @org.junit.Test
    public void testA(){
        SelectionSort.sort(a);
        org.junit.Assert.assertArrayEquals(a, expected);
    }
    @org.junit.Test
    public void testB(){
        SelectionSort.sort(b);
        org.junit.Assert.assertArrayEquals(b, expected);
    }

    @org.junit.Test
    public void testC(){
        SelectionSort.sort(c);
        org.junit.Assert.assertArrayEquals(c, expected);
    }

    private void printList(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }



}
