package Problems;

public class Quadrant {
    // BJP5 Exercise 4.19: quadrant
    // https://practiceit.cs.washington.edu/problem/view/bjp5/chapter4/e19-quadrant
    public static int findQuad(int x, int y){
        int value = 0;
        if(x == 0 || y == 0)
        {
            return value;
        }
        else if (x > 0 && y > 0)
        {
            return value = 1;
        }

        else if (x < 0 && y < 0)
        {
            return value = 3;
        }

        else if (x > 0 && y < 0)
        {
            return value = 4;
        }

        else
        {
            return value = 2;
        }
    }
}
