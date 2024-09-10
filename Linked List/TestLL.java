
class Node {
    int data;
    Node next;
    
    Node(int x) {
        data = x;
        next = null;
    }
}

public class TestLL {
    
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Define printlist method inside main
        class ListPrinter {
            void printlist(Node head) {
                Node curr = head;
                while (curr != null) {
                    System.out.print(curr.data + " ");
                    curr = curr.next;
                    System.out.println("Curr Next" + curr.next);
                }
            }
        }
        
        ListPrinter printer = new ListPrinter();
        printer.printlist(head);
    }
}

