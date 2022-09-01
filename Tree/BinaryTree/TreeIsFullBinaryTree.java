package Tree.BinaryTree;

public class TreeIsFullBinaryTree {

    private Node root;

    static class Node{
        int data;
        Node left, right;

        Node(int d){
            data = d;
            left = right = null;
        }
    }

    private boolean isFullBinaryTree(Node node){
        if(node == null){
            return true;
        }

        if(node.left == null && node.right == null){
            return true;
        }
        if((node.left != null) && (node.right != null)){
            return (isFullBinaryTree(node.left))
                    && isFullBinaryTree(node.right);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeIsFullBinaryTree tree = new TreeIsFullBinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        if(tree.isFullBinaryTree(tree.root)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
