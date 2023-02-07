package Problems;

public class StarPyramid {
    // Create a Star Triangle
    //https://practiceit.cs.washington.edu/problem/view/bjp5/chapter2/e5-starTriangle
    //TODO: A double for loop is not the best solution, O(n^2) Find a way to produce a solution that is O(N)

    /**
    Create a Star pyramid that is 5 high
     */
    public static void fiveHigh(){
        // Using a double for loop we can just (i) & (j) pointers to keep track of what line we're on and how many stars to append
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j<i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    /**
     * Create a star Pyramid with a custom height passed as the parameter
     * @param h = height of the pyramid
     */
    public static void customHeight(int h){
        // i determines the current layer, j determines how many stars are placed in that layer
        for(int i = 1; i <= h; i++){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
