package Tree.BinaryTree;

public class BinaryTreeTraversal {

    Node root;

    BinaryTreeTraversal(){
        root = null;
    }

    static class Node{
        int data;
        Node left, right;

        Node(int d){
            data = d;
            left = right = null;
        }
    }

    private static void postOrderTraversal(Node node){
        if(node == null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");

    }

    private static void preOrderTraversal(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    private static void inOrderTraversal(Node node){
        if(node == null){
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public static void main(String[] args) {

        BinaryTreeTraversal treeTraversal = new BinaryTreeTraversal();

        treeTraversal.root = new Node(1);
        treeTraversal.root.left = new Node(2);
        treeTraversal.root.right = new Node(3);
        treeTraversal.root.left.left = new Node(4);
        treeTraversal.root.left.right = new Node(5);

        System.out.println("InOrder : ");
        treeTraversal.inOrderTraversal(treeTraversal.root);

        System.out.println();
        System.out.println("PostOrder : ");
        treeTraversal.postOrderTraversal(treeTraversal.root);

        System.out.println();
        System.out.println("PreOrder : ");
        treeTraversal.preOrderTraversal(treeTraversal.root);
    }
}
