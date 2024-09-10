

public class LL2 {

    private Node head;
    private Node tail;
    private int size;

    public LL2() {
        this.size = 0;
    }

    // Insert at the beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at the end
    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    // Remove the first node
    public int removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // Print the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL2 list = new LL2();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertLast(30);
        list.display();

        System.out.println("Removed: " + list.removeFirst());
        list.display();
    }
}


