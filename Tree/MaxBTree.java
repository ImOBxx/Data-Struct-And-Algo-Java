

class Node {

    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class MaxBTree {

    public static void main(String[] args) {
        
        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println("Maximum value in the tree: " + getMax(root));
    }

    public static int getMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int max = root.key;
        int leftMax = getMax(root.left);
        int rightMax = getMax(root.right);

        if (leftMax > max) {
            max = leftMax;
        }

        if (rightMax > max) {
            max = rightMax;
        }

        return max;
    }
}
