package RoughWork.Tree;

import java.util.Scanner;

public class BinarySearchTree {

    public class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node root;
    BinarySearchTree(){
        root = null;
    }

    public Node insert(Node root, int key){
        if(root == null){
            root = new Node(key);
        }
        if(root.data > key){
            root.left = insert(root.left, key);
        }
        if(root.data > key){
            root.right = insert(root.right, key);
        }
        return root;
    }

    private void inOrder(Node root) {
        if(root == null)
            return;

        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }


    private void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.left);
    }

    private void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.left);
        System.out.println(root.data+" ");
    }

    public void insertTree(int value){
        root = insert(root,value);
    }
    private void inOrderTraversal() {
        inOrder(root);
    }
    private void preOrderTraversal() {
        inOrder(root);
    }
    private void postOrderTraversal() {
        inOrder(root);
    }




    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter numbers");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
           int  m = sc.nextInt();
            bst.insertTree(m);
        }

        System.out.println("Inorder Traversal");
        bst.inOrderTraversal();
        System.out.println("Preorder Traversal");
        bst.preOrderTraversal();
        System.out.println("Postorder Traversal");
        bst.postOrderTraversal();


    }
//                20
//                30
//                40
//                50
//                60
//                70
//                80

}
