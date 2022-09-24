package BinaryTree;

public class BinarySearchTree {
    private class Node {
        int val;
        Node right;
        Node left;

        public Node(int val) {
            this.val = val;
        }
    }

    Node root;

    public void insert(int val) {
        root = insertNode(root, val);
    }

    public Node insertNode(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.val)
            root.left = insertNode(root.left, val);
        else if ((val > root.val))
            root.right = insertNode(root.right, val);
        return root;
    }

    public void SortedOrder() {
        inOrderTraversal(root);
    }

    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.println(root.val);
            inOrderTraversal(root.right);
        }
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(5);
        tree.insert(1);
        tree.insert(2);
        tree.insert(9);
        tree.SortedOrder();
    }
}
