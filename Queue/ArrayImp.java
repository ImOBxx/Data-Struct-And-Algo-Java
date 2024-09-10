import java.util.LinkedList;
import java.util.Queue;

public class ArrayImp {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);
        queue.offer(3);

        //System.out.println(queue.remove());
        //System.out.println(queue.remove());
        //System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        
        
        System.out.println(queue);
        
        
        


         //Removing and printing elements from the queue
        while (!queue.isEmpty()) {
            //System.out.println(queue.remove());
       }
    }
}
