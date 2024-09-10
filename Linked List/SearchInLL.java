class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class SearchInLL {

    public static int search(Node head, int x) {
        if (head == null) {
            return -1;
        }
        if (head.data == x) {
            return 0;
        }
        int res = search(head.next, x);
        if (res == -1) {
            return -1;
        } else {
            return res + 1;
        }
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
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);

        printlist(head);

        int x = 20;
        int position = search(head, x);
        if (position != -1) {
            System.out.println("Element " + x + " is present at index " + position);
        } else {
            System.out.println("Element " + x + " is not present in the linked list");
        }
    }
}
