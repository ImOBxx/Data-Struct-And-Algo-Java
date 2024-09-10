class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class DelHeadCLL {

    static Node delhead(Node head) {
        if (head == null) return null;

        if (head.next == head) return null;

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = head.next;
        return head.next;
    }

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
        head.next.next.next = head;

        System.out.println("Original list: ");
        printlist(head);

        head = delhead(head);

        System.out.println("After removing head: ");
        printlist(head);
    }
}
