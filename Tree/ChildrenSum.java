
class Node {

    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class ChildrenSum {

    public static void main(String[] args) {
        
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.right.right = new Node(9);
        root.right.left = new Node(3);
        
        System.out.println("Children Sum: " + isSum(root));
    }

    public static boolean isSum(Node root) {
        if (root == null) {
            return true;
        }
        
        if (root.left == null && root.right == null) {
            return true;
        }
        
        int sum = 0;
        
        if (root.left != null) {
            sum += root.left.key;
        }
        
        if (root.right != null) {
            sum += root.right.key;
        }
        
        return (root.key == sum && isSum(root.left) && isSum(root.right));
    }
}
