package Scratch;


public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /**
     * find the value at index i
     * @param i = index in intList
     * @return
     */
    public int get(int i){
         if(i == 0){
             return first;
         }
         return rest.get(i-1);

    }
}
