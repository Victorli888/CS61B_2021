package Scratch;

/**
 * Joshua Hug CS61B Lecture on Static and Instance within Classes in Java.
 */
public class Dog {
    /**
     * instance variable to be used every time our class is INSTANTIATED.
     */
    public int weight;

    /**
     * Our Constructor, when a new class is instantiated, this method is used to establish the dependencies needed for
     * our new object correctly work.
     * @param w  Weight is in lbs
     */
    public Dog(int w ){
        weight = w;
    }

    /**
     * Based of a weight of 20lbs or more A dog will make a particular noise
     */
    public void makeNoise(){
        if (weight > 20){
            System.out.print("Bork Bork");
        }
        else{
            System.out.print("yap yap");
        }
    }

    /**
     * Given 2 dogs, Finds the Largest Dog based on weight.
     * @param dogA 1st Dog
     * @param dogB 2nd Dog
     */
    public static void maxDawg(Dog dogA, Dog dogB){
        if (dogA.weight > dogB.weight){
            dogA.makeNoise();
        }
        else{
            dogB.makeNoise();
        }
    }


    /**
     * Instance Method for maxDawg, We will need to instantiate a Dog, and then that dog will compare its weight, with
     * another and which ever dawg is largest in weight will make a noise.
     * @param otherDawg
     * @return
     */
    public void maxDawg(Dog otherDawg){
        if (otherDawg.weight > weight){
            otherDawg.makeNoise();
        }
        else{
            makeNoise();
        }
    }

}
