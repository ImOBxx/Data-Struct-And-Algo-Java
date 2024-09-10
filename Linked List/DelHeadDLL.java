
class Node{
    int data;
    Node prev;
    Node next;

    Node (int x)
    {
        data = x;
        prev = null;
        next = null;
    }
}

public class DelHeadDLL {

    static Node delhead(Node head, int x)
{
    if (head == null)
    {
        return null;
    }
    if (head.next == null)
    {
        return null;
    }
    else
    {
        head = head.next;
        head.prev = null;
        return head;
    }
}

static void printlist(Node head)
{
    Node curr = head;
    while (curr != null) {
        System.out.println(curr.data + " ");
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

    head = delhead(head, 10);
    printlist(head);
}
    
}
