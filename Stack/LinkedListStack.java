
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class MyStack {
    Node head;
    int sz;
    MyStack() {
        head = null;
        sz = 0;
    }
    
    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        sz++;
    }
    
    int pop() {
        if (head == null) { return Integer.MAX_VALUE; }
        int res = head.data;
        Node temp = head;
        head = head.next;
        sz--;
        return res;
    }
    
    int peek() {
        if (head == null) { return Integer.MAX_VALUE; }
        return head.data;
    }
    
    int size() {
        return sz;
    }
    
    boolean isEmpty() {
        return head == null;
    }
    
    void printStack() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class LinkedListStack {
    public static void main (String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(10);
        s.push(20);
        s.push(40);
        s.pop();
        s.pop();
        
        System.out.println("Stack contents:");
        s.printStack();
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
