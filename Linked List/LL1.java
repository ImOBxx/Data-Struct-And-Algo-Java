
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LL1 {

    // Method to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to add a node at the end of the linked list
    public static Node addNode(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;

        // Print the original list
        System.out.println("Original list:");
        printList(head);

        // Add a new node to the list
        head = addNode(head, 40);
        System.out.println("List after adding 40:");
        printList(head);

        // Add another node to the list
        head = addNode(head, 50);
        System.out.println("List after adding 50:");
        printList(head);
    }
}
