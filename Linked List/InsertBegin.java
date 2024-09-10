class Node {
    int data;
    Node next;
    
    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertBegin {

    static Node InsertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }
    
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertBegin(head, 30);
        head = InsertBegin(head, 20);
        head = InsertBegin(head, 10);
        
        printList(head); // This will print the list
        
        // main should not return anything
    }
}

