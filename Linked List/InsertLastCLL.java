class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class InsertLastCLL {
    
    static void printlist(Node head) {
        if (head == null) return;
    
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    static Node insertlast(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
            return head;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        System.out.println("Original List: ");
        printlist(head);

        head = insertlast(head, 15);

        System.out.println("List after inserting 15 at the end: ");
        printlist(head);
    }
}
