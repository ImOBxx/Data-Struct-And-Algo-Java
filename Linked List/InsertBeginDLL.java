
class Node {

    int data;
    Node prev;
    Node next;

    Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
}

public class InsertBeginDLL {

    static Node insert(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        return temp;
    }

    static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        printlist(head);

        head = insert(head, 5);
        printlist(head);
    }
}

