
class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this(data, null);
    }
}

public class CloneList {

    public static void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static Node copyList(Node head) {
        if (head == null) {
            return null;
        }

        Node newNode = new Node(head.data);

        newNode.next = copyList(head.next);

        return newNode;
    }

    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4};

        Node head = null;

        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        Node dup = copyList(head);

        printList(dup);
    }
}
