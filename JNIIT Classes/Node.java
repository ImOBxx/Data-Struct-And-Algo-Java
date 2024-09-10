
public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    public static void main(String[] args) {
        Node node = new Node(5);
        System.out.println(node);
    }
}


