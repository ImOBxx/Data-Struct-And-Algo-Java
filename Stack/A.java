import java.util.ArrayList;

class MyStack {

    ArrayList<Integer> al = new ArrayList<>();

    void push(int x) {
        al.add(x);
    }

    int pop() {
        if (al.isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        int res = al.get(al.size() - 1);
        al.remove(al.size() - 1);
        return res;
    }

    int peek() {
        if (al.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return al.get(al.size() - 1);
    }

    boolean isEmpty() {
        return al.isEmpty();
    }

    int size() {
        return al.size();
    }
}

public class A {

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        System.out.println("Popped element: " + s.pop()); // Output: 20
        s.push(30);
        System.out.println("Top element: " + s.peek()); // Output: 30
        System.out.println("Is stack empty? " + s.isEmpty()); // Output: false
        System.out.println("Stack size: " + s.size()); // Output: 2
    }
}

