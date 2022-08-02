package JavaRoughWork;

import java.util.Stack;

public class PreorderTraversal {
    static class Node {
              int data;
              Node left, right;

        Node(int d){
            data = d;
            left = null;
            right = null;

        }

    }

    // using Recursion method
    public static void preorderTraversal(Node node)
    {
        if (node == null)
        {
            return;
        }
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    // Iterative method

    public void preorderTraversalIter(Node node){
            if(node == null)
                return;

            Stack<Node> stack = new Stack<Node>();
            stack.push(node);

            while(!stack.empty()){

                Node n = stack.pop();
                System.out.printf("%d ",n.data);

                if(n.right != null){
                    stack.push(n.right);
                }
                if(n.left != null){
                    stack.push(n.left);
                }

            }

        }

    public static void main(String[] args) {
        PreorderTraversal tree = new PreorderTraversal();

        Node newNode = buildBinaryTree();
        System.out.println("Recursion");

        tree.preorderTraversal(newNode);

        System.out.println();
        System.out.println("Iteration");
        tree.preorderTraversalIter(newNode);


    }

    private static Node buildBinaryTree() {

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
            node60.right  = node70;

        return newNode;
    }
}
