public class BinaryTree1 {
    public Node ROOT;

    public Node parent, current;

    // Inner Node class
    public static class Node {
        String info;
        Node lchild, rchild;

        public Node(String info, Node lchild, Node rchild) {
            this.info = info;
            this.lchild = lchild;
            this.rchild = rchild;
        }
    }

    public BinaryTree1() {
        ROOT = null;
    }

    public void insert(String element) {
        Node temp;
        parent = current = null;

        if (find(element)) {
            System.out.println("Duplicate words not allowed");
            return;
        } else {
            temp = new Node(element, null, null);
            if (parent == null) {
                ROOT = temp;
            } else {
                if (element.compareToIgnoreCase(parent.info) < 0) {
                    parent.lchild = temp;
                } else {
                    parent.rchild = temp;
                }
            }
        }
    }

    public boolean find(String element) {
        current = ROOT;
        parent = null;
        while (current != null && !element.equals(current.info)) {
            parent = current;
            if (element.compareToIgnoreCase(current.info) < 0) {
                current = current.lchild;
            } else {
                current = current.rchild;
            }
        }
        return current != null;
    }

    public void inorder(Node ptr) {
        if (ptr != null) {
            inorder(ptr.lchild);
            System.out.print(ptr.info + " ");
            inorder(ptr.rchild);
        }
    }

    public static void main(String[] args) {
        BinaryTree1 x = new BinaryTree1();
        x.insert("Banana");
        x.insert("Apple");
        x.insert("Grapes");
        x.insert("Orange");

        x.inorder(x.ROOT);
    }
}
