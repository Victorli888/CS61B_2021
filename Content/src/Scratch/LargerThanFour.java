package Scratch;
/**
 * This is an Example Problem from https://www.youtube.com/watch?v=sKWmiT0XErY&list=PL8FaHk7qbOD5Q4GloF2DHaancV6BOJzL0&index=10
 * We must determine which Dog in our neighborhood contains a dog that is larger than
 * 4 our its closest Neighbors.
 *
 * Input: [10,15,20,15,10,5,10,15,22,20]
 * Output: [20,22]; Because [10,15,{20},15,10,5,10,15,{22},20]
 *
 */
public class LargerThanFour {
    /**
     * Array of Dog objects instantiated with a particular weight
     */
     public static Dog[] dogs = new Dog[]{
            new Dog(10),
            new Dog(15),
            new Dog(20),
            new Dog(15),
            new Dog(10),
            new Dog(5),
            new Dog(10),
            new Dog(15),
            new Dog(22),
            new Dog(15),
            new Dog(20)
    };

    /** The Main method used to solve the problem. Creates a new array to store all the dogs for our answer and appends
     * them to the array after iterating through and checking for isBiggestOfFour. Count is used to count the number of dogs we have appended to our new array
     * We will use this to create a new array with the appropiate size for our answer.
     * @param doggyArray array containing dogs to find largest of four neighbors
     * @return the Weights of dogs that are larger than four from the doggyArray.
     */
     public static Dog[] largerThanFourNeighbors(Dog[] doggyArray){
        Dog[] returnDogs = new Dog[doggyArray.length];
        int count = 0;

        for (int i = 0; i < doggyArray.length; i++){
            if (isBiggestOfFour(doggyArray, i)){
                returnDogs[count] = doggyArray[i];
                count++;
            }
        }

        returnDogs = arrayWithNoNulls(returnDogs, count);
        return returnDogs;
    }

    /**
     * Find the appropriate size to make our array to store our answer for largerThanFourNeighbors.
     * @param doggyArray Pass in the array containing our answer and null values
     * @param count Pass the total number of answers found and appened to the array
     * @return
     */
    public static Dog[] arrayWithNoNulls(Dog[] doggyArray,  int count){
        Dog[] noNullDogs = new Dog[count];
        for(int i = 0; i < count; i++){
            noNullDogs[i] = doggyArray[i];
        }
        return noNullDogs;
    }

    /**
     * Compare a dog with its 4 closest neighbors.
     * @param doggyArray Array of Dogs corresponding to a neighbor
     * @param i Initial compare item that will be tested against 3 other dogs.
     * @return
     */
    public static boolean isBiggestOfFour(Dog[] doggyArray, int i){
       boolean isBiggest = true;

       for(int j = -2;j <= 2; j++){
        int compareIndex = i+j;

        /* Do not compare yourself with yourself */
        if (j == 0) {
            continue;
        }

        /* Only do the comparison if the index is valid otherwise this assert index out of array */
        if (validIndex(doggyArray, compareIndex ) ) {
            if (doggyArray[compareIndex].weight >= doggyArray[i].weight) {
                isBiggest = false;
            }
        }
       }
       return isBiggest;
    }

    /**
     * This helper function is used specifically to determine whether an index will be out of range in an array.
     * @param doggyArray
     * @param i what is passed is the summation of two indices i + j, if negative than there is no possible index in array
     * @return True, only if Index is possible in Array.
     */
    public static boolean validIndex(Dog[] doggyArray, int i) {
        if (i < 0 ){
            return false;
        }
        if (i >= doggyArray.length){
            return false;
        }
        return true;
    }

    public static void startTest(){

        Dog[] dawgs = largerThanFourNeighbors(dogs);
        for(int i = 0; i < dawgs.length; i++){
            System.out.print(dawgs[i].weight + " ");
        }

    }

}
