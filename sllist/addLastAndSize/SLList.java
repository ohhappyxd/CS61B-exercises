public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first; 

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
        IntNode n = first;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new IntNode(x, null);
    }

    /** Returns the number of items in the list using recursion. */
    public int size() {
        /* Your Code Here! */
        return getSize(first);
    }

    private static int getSize(IntNode n) {
        if (n.next == null) return 1;
        return 1 + getSize(n.next);
    }

}