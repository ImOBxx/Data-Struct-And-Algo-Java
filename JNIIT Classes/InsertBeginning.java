import java.util.Scanner;

public class InsertBeginning {

    public class Node {
        int rollNumber;
        String name;
        Node nextNode;
    }

    public class SinglyLinkedList {
        public Node START;

        public SinglyLinkedList() {
            START = null;
        }

        public void addNode(Scanner scanner) {
            int rollNo;
            String nm;
            System.out.println("Enter the roll number of the Student:");
            rollNo = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the Name of the Student:");
            nm = scanner.nextLine();

            Node newNode = new Node();
            newNode.rollNumber = rollNo;
            newNode.name = nm;

            Node curr, prev;
            prev = null;
            curr = START;

            while ((curr != null) && (rollNo >= curr.rollNumber)) {
                if (rollNo == curr.rollNumber) {
                    System.out.println("Duplicate Roll Number Not Allowed");
                    return;
                }
                prev = curr;
                curr = curr.nextNode;
            }

            newNode.nextNode = curr;
            if (prev == null) {
                START = newNode;
            } else {
                prev.nextNode = newNode;
            }
        }

        public void insertAtBeginning(Scanner scanner) {
            int rollNo;
            String nm;
            System.out.println("Enter the roll number of the Student:");
            rollNo = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the Name of the Student:");
            nm = scanner.nextLine();

            Node newNode = new Node();
            newNode.rollNumber = rollNo;
            newNode.name = nm;

            newNode.nextNode = START;
            START = newNode;
        }

        public boolean isEmpty() {
            return START == null;
        }

        public void traverse() {
            if (isEmpty()) {
                System.out.println("List is Empty.");
            } else {
                System.out.println("The Records in the List are:");
                Node currNode;
                for (currNode = START; currNode != null; currNode = currNode.nextNode) {
                    System.out.println(currNode.rollNumber + " - " + currNode.name);
                }
            }
        }

        public boolean deleteNode(int rollNo) {
            Node curr, prev;
            prev = null;
            curr = START;

            while ((curr != null) && (rollNo != curr.rollNumber)) {
                prev = curr;
                curr = curr.nextNode;
            }
            if (curr == null) {
                return false;
            } else {
                if (curr == START) {
                    START = START.nextNode;
                } else {
                    prev.nextNode = curr.nextNode;
                }
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList1 outer = new LinkedList1();
        SinglyLinkedList mylist = new SinglyLinkedList();

        mylist.traverse();
        mylist.addNode(scanner);
        mylist.addNode(scanner);
        mylist.traverse();

        System.out.println("Insert a node at the beginning:");
        mylist.insertAtBeginning(scanner);
        mylist.traverse();

        System.out.println("Enter the roll number of the Student to delete:");
        int rollNoToDelete = Integer.parseInt(scanner.nextLine());
        boolean isDeleted = mylist.deleteNode(rollNoToDelete);
        if (isDeleted) {
            System.out.println("Record deleted successfully.");
        } else {
            System.out.println("Record not found.");
        }

        mylist.traverse();
        scanner.close();
    }
}
