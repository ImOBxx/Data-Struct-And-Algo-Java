import java.util.*;

public class FirstLastTraversal {
      public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<Integer>();

        d.addFirst(10);

        d.addFirst(20);

        d.addFirst(5);

        d.addFirst(15);

        Iterator it = d.descendingIterator();
        while(it.hasNext())
             System.out.println(it.next() + " ");
      }
    
}