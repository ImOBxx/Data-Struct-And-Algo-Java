public class DeleteFrstNode {
    
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node delHead(Node head) {
        if (head == null) {
            return null;
        } else {
            return head.next;
        }
    }

    public static void main(String[] args) {
        DeleteFrstNode list = new DeleteFrstNode();
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);

        System.out.println("Original list:");
        printList(head);

        head = list.delHead(head);

        System.out.println("List after deleting the first node:");
        printList(head);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
