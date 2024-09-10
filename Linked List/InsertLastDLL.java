
class Node {
    int data;
    Node prev; // Adding prev pointer for doubly linked list
    Node next;
    
    Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
}

public class InsertLastDLL {

    static Node insertlast(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
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

        head = insertlast(head, 40);
        printlist(head);
    }
}
