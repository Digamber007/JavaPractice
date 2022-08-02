package JavaRoughWork;

import java.util.Stack;

public class InorderTraversal {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = null;
            right = null;

        }
    }

    // Recursion method
    public static void InorderTraversal(Node node){
        if(node == null){
            return;
        }
        InorderTraversal(node.left);
        System.out.print(node.data +" ");
        InorderTraversal(node.right);


    }

    // Iterative method
    private void InorderTraversalIter(Node node) {
        if( node == null ) {
            return;
        }

        Stack<Node> stack = new Stack<>( );
        Node current = node;

        while( !stack.empty() || current != null ) {
                if(current != null){
                    stack.push(current);
                    current = current.left;
                }else{
                    Node n = stack.pop();
                    System.out.print(n.data+" ");
                    current =n.right;
                }

        }
    }

    public static void main(String[] args) {

        InorderTraversal tree = new InorderTraversal();

        Node newNode = buildBinaryTree();
        System.out.println("Recursion");
        tree.InorderTraversal(newNode);

        System.out.println();
        System.out.println("Iteration");
        tree.InorderTraversalIter(newNode);

    }

    private static Node buildBinaryTree() {

//        10 30 20 50 70 60 40

        Node newNode = new Node(40);
        Node node20 = new Node(20);
        Node node10=new Node(10);
        Node node30=new Node(30);
        Node node60=new Node(60);
        Node node50=new Node(50);
        Node node70=new Node(70);

        newNode.left = node20;
        newNode.right = node60;

        node20.left = node10;
        node20.right = node30;

        node60.left = node50;
        node60.right = node70;

        return newNode;
    }
}
