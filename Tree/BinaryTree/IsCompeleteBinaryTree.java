package Tree.BinaryTree;

public class IsCompeleteBinaryTree {

    Node root;

    static class Node{
        int data;
        Node left , right;

        Node(int d){
            data = d;
            left = right = null;
        }
    }

    private int countNumNode(Node node){
        if(node == null)
            return (0);

            return (1+ countNumNode(node.left) + countNumNode(node.right));

    }
    private boolean isCompleteTree(Node node, int ind, int numNode){
        if(node == null){
            return true;
        }
        if(ind >= numNode){
            return false;
        }
        return (isCompleteTree(node.left, 2*ind+1,numNode)
                && isCompleteTree(node.right, 2*ind+1, numNode));
    }

    public static void main(String[] args) {

        IsCompeleteBinaryTree tree = new IsCompeleteBinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(6);

        int ind = 0;
        int nodeCount = tree.countNumNode(tree.root);
        if (tree.isCompleteTree(tree.root, ind, nodeCount)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
