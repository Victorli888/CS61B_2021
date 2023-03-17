package Scratch;

/**
 * SLList class demonstrating how we can hide "nakedness" in our IntList Class
 */
public class SLList {
    /**
     * Dummy node used as an invariant to guarantee SLList works as intended, when empty
     */
    public IntNode dummy;
    private int size;

    /*Helper Class to create our SLList*/
    private  class IntNode{
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    /**
     * In the circumstance of an empty list, we can pass a dummy node to start with so our SLList will function correctly
     */
    public SLList(){
        dummy = new IntNode(69, null);
    }

    /**
     * Polymorphism, in the case when an integer is passed in at the time of instantiation.
     * @param x
     */
    public SLList(int x){
        dummy.next = new IntNode(x, null);
        size++;
    }

    /**
     * To the Head of our SLList we want to append a new node
     * @param x - New item x
     */
    public void addFirst(int x){
        dummy.next = new IntNode(x, dummy.next);
        size++;
    }

    /**
     * Get the item in our first or "head" node.
     * @return some item in the node
     */
    public int getFirst(){
        return dummy.next.item;
    }

    /**
     * Add an item to the tail end of our SLLlist
     * @param x
     */
    public void addLast(int x ) {
        /* We have to start somewhere, We will need to start with our instance variable first */
        IntNode p = dummy;

        /* We need to iterate through until we find the end of our List */
        while (p.next != null) {
            p = p.next;
        }

        /* once we == null, we have hit the end of our list, then we can add x to the list. */
        p.next = new IntNode(x, null);
        size++;

    }

    /**
     * This unrestricted public method lets all that use SLList to access this method
     * @return
     */
    public int size(){
        return size;
    }

    /**
     * Iterate through our SLList and print all values
     * @param p
     */
    private void printAll(IntNode p){
        while(p != null){
            System.out.println(p.item);
            p = p.next;
        }
    }
    public void printAll(){
        printAll(dummy.next);
    }
}
