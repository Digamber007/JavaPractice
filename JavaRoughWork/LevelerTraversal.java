package JavaRoughWork;

import java.util.LinkedList;
import java.util.Queue;

public class LevelerTraversal {
     private static Node node;
//
    ///Node node;
    public static class Node{
        int data;
        Node left, right;

        Node(int d){
            data =d;
            left = null;
            right = null;
        }
    }


    public static void leveOrderTraversal(Node node) {
        if(node == null){
            return;
        }

        Queue<Node> list = new LinkedList<Node>();
        list.add(node);
        while (!list.isEmpty()) {

            Node tempNode = list.poll();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) {
                list.add(tempNode.left);
            }
            if (tempNode.right != null) {
                list.add(tempNode.right);
            }
        }


    }
    public static void main(String[] args) {

        LevelerTraversal tree = new LevelerTraversal();
        
        tree.node = new Node(1);
        tree.node.left = new Node(2);
        tree.node.right = new Node(3);
        tree.node.left.left = new Node(4);
        tree.node.left.right = new Node(5);
        tree.node.right.left = new Node(6);


        tree.leveOrderTraversal(node);
    }

}
