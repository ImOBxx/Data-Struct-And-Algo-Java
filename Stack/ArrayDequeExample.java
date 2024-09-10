import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> s = new ArrayDeque<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(50);
        s.pop();
        s.pop();
        System.out.println("Top element: " + s.peek());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Top element after pop: " + s.peek());
        System.out.println("Size Of The Stack: " + s.size());
        System.out.println("Stack Empty: " + s.isEmpty());

        
        // Print all elements in the stack
        System.out.println("Stack contents:");
        for (Integer element : s) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
