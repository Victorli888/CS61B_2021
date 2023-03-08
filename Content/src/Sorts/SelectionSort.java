package Sorts;

public class SelectionSort {

    /**
     * Public Method used to sort an int[] using Selection Sort Algorithm
     * @param nums array of ints
     */
    public static void sort(int[] nums){
        sort(nums, 0);
    }

    /**
     * Private method used inside the SelectionSort class
     * @param nums array of ints
     * @param startingIndex starting index for when we sort
     */
    private static void sort(int[] nums, int startingIndex){
        /* Recursive Base Case, Resolve Out of array Error */
        if (startingIndex >= nums.length){
            return;
        }

        /* Recursively find and swap the smallest number to the front, when found we should continue at a new start */
        int smallestIndex = findSmallest(nums, startingIndex);
        swap(nums,startingIndex,smallestIndex);

        sort(nums,startingIndex+1);
    }

    /**
     * In place swap method, that swaps to Items in an array
     * @param x some array containing integers
     * @param a First Item
     * @param b Second Item
     */
    private static void swap(int[] x,int a, int b){
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    /**
     * Given an int[] we will search and find the index containing the smallest number
     * @param x given array of ints
     * @param startingIndex Starting index for where to begin search
     * @return
     */
    private static int findSmallest(int[] x, int startingIndex){
        int currSmallest = startingIndex;
        for(int i = startingIndex; i< x.length; i++){
            if(x[i] < x[currSmallest]){
                currSmallest = i;
            }
        }
        return currSmallest;
    }
    /**TODO: Finish test Cases and write summary for each method**/

}
