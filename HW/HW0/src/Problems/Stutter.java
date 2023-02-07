package Problems;

public class Stutter {
    // BJP5 Exercise 4.17: stutter
    // https://practiceit.cs.washington.edu/problem/view/bjp5/chapter4/e17-stutter

    public static String repeatTwo(String str){
        String newString = "";
        for (int i = 0; i < str.length(); i++){
            newString = newString + str.charAt(i) + str.charAt(i);
        }

        return newString;
    }
}
