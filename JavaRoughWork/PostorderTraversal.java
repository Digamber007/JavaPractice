package JavaRoughWork;

import java.util.Stack;

public class PostorderTraversal {
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
        public static void postorderTraversal(Node node){
            if(node == null){
                return;
            }
                postorderTraversal(node.left);
                postorderTraversal(node.right);
                System.out.print(node.data +" ");

        }

        // Iterative method
    private void postorderTraversalIter(Node node) {
        if( node == null ) {
            return;
        }

        Stack<Node> stack = new Stack<>( );
        Node current = node;

        while( true ) {

            if( current != null ) {
                if( current.right != null )
                    stack.push( current.right );
                stack.push( current );
                current = current.left;
                continue;
            }

            if( stack.isEmpty( ) )
                return;
            current = stack.pop( );

            if( current.right != null && ! stack.isEmpty( ) && current.right == stack.peek( ) ) {
                stack.pop( );
                stack.push( current );
                current = current.right;
            } else {
                System.out.print( current.data + " " );
                current = null;
            }
        }
    }

        public static void main(String[] args) {

            PostorderTraversal tree = new PostorderTraversal();

          Node newNode = buildBinaryTree();
            System.out.println("Recursion");
            tree.postorderTraversal(newNode);

            System.out.println();
            System.out.println("Iteration");
            tree.postorderTraversalIter(newNode);

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
