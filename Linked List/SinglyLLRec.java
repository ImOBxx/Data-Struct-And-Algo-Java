
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class SinglyLLRec {

    public static void printlist(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        printlist(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(1, new Node(4, new Node(3, null)));
        printlist(head); // Corrected method call
    }
}
