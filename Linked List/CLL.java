/*class Node {
    int data;
    Node next;
    Node (int d) {
        data = d;
        next = null;
    }
 psvm
 {
    Node head = new Node(10);
    head.next = new Node(5);
    head.next.next = new Node(20);
    head.next.next.next = new Node(15);
    head.next.next.next.next = head;
 }
 */

 class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class CLL {
    static void printlist(Node head) {
        if (head == null) return;

        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head; // Making the list circular

        printlist(head);
    }
}
