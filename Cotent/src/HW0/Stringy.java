package HW0;

public class Stringy {
    //  BJP5 Exercise 3.23: printIndexed
    // https://practiceit.cs.washington.edu/problem/view/bjp5/chapter3/e23-printIndexed
    public static void printIndexed(String string){
        int pointer = 0;
        for (int i = string.length()-1; i >=0; i--){
            System.out.print(string.charAt(pointer));
            System.out.print(i);
            pointer++;
        }

    }

    public static void stutter(String string){

    }

    public static void test(){
         String str = "wow";
         System.out.print(str.charAt(0) + 1);
        }
}
