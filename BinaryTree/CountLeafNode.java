package BinaryTree;

public class CountLeafNode {

    Node root;
   static class Node{
        int data;
        Node left, right;

        Node(int value){
            data = value;
            left = right = null;
        }
    }

    static int countLeafNode(Node node){
        if(node==null){
            return 0;
        }
        if(node.left ==null && node.right ==null){
            return 1;
        }
        else{
            return countLeafNode(node.left) + countLeafNode(node.right);
        }

    }

    public static void main(String[] args) {
        CountLeafNode tree = new CountLeafNode();

        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(8);

        // create child nodes of left child
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);

        // create child nodes of right child
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(9);

        System.out.println("leaf node are :" + tree.countLeafNode(tree.root));
    }
}
