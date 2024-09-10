
class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}


public class SinglyLL2 {

    public static void printlist(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        SinglyLL2 x = new SinglyLL2();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Singly Linked List: ");

        printlist(head);

        


    }
    
}
