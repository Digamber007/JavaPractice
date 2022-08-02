package RoughWork;

import JavaRoughWork.PairRoot;

import java.util.*;


public class CountLeaves {

    public class Node {
        public Node left;
        public Node right;
        int data;
        Node Left, Right;

        Node(int d){
            data = d;
            Left = Right = null;
        }

    }

    private Node root;

    CountLeaves(){
            root = null;
        }

    public static int countLeaf(Node node){

        if(node == null) {
            return 0;
        }

        if(node.Left == null && node.Right == null){
            return -1;
        }else {
            return countLeaf(node.Left) + countLeaf(node.Right);
        }
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }
        String str = " <- " + node.data + " -> ";

        str += (node.left == null) ? "." :  " " + node.left.data;
        str += (node.right == null) ? "." : " " + node.right.data;

        System.out.println(str);


        display(node.left);
        display(node.right);
    }


    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        CountLeaves tree = new CountLeaves();
        int n = sc.nextInt();
        int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }



         int leafNode = countLeaf(tree.root);
        System.out.println("Leaf Node --> " + countLeaf(tree.root));
        //display(node);

    }
}
