package Tree.BinaryTree;

import java.awt.*;

public class HightOfTree {
//    private static Node root;
    static class Node{
        int value;
        Node left,right;

        Node(int value){
            value = value;
            left = right =null;
        }
    }

    static int hightOfTree(Node node){

        if(node == null){
            return 0;

        }
        else{
            return 1 + Math.max(hightOfTree(node.left) , hightOfTree(node.right));
        }
    }

//    static int index = -1;
//    public static Node buildTree(int[] node) {
//        index++;
//        if(node[index] == -1){
//            return null;
//        }
//
//        Node newNode = new Node(node[index]);
//        newNode.left = buildTree(node);
//        newNode.right = buildTree(node);
//
//        return newNode;
//
//    }

    public static void main(String[] args) {

//        int[] node = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };

        HightOfTree tree = new HightOfTree();

        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

//        Node root = tree.buildTree(node);
        System.out.println(hightOfTree(root));
    }
}
