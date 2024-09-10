public class LinkedList {
    private Node head;

    // Node class as an inner class
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a new node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Remove a node with the specified data
    public boolean remove(int data) {
        if (head == null) {
            return false;
        }
        if (head.data == data) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next == null) {
            return false;
        }
        current.next = current.next.next;
        return true;
    }

    // Display the elements of the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.display(); // Output: 1 -> 2 -> 3 -> null
        list.remove(2);
        list.display(); // Output: 1 -> 3 -> null
        list.remove(1);
        list.display(); // Output: 3 -> null
        list.remove(3);
        list.display(); // Output: List is empty
    }
}
