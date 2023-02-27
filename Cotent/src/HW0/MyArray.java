package HW0;
// https://sp21.datastructur.es/materials/hw/hw0/hw0#exercise-2

/**
 * Class for Custom Array Methods
 */
public class MyArray {
    /**
     * Find the Maximum integer in a given array
     * @param m is an array of integers
     * @return
     */
    public static int max(int[] m ) {
        /** Returns the maximum value from m. */
        int maxNum = m[0];
        int j = 1;
        for( int i = 0; j < m.length; i++ ){
            if (m.length == 1){
                return maxNum;
            }
            else if (m[i] < m[j]) {
                maxNum = m[j];
            }
            j++;
        }
        return maxNum;
    }
}
