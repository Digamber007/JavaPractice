package RoughWork.Tree;

import java.util.ArrayList;
import java.util.List;

public class LeftView {

    static Node root;
    static List<Integer> output;

    static class Node{

        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    private static void getLeftView(Node node, int levelNumber){
        if(node != null){
           if(levelNumber == output.size()){
               output.add(node.data);
           }
           getLeftView(node.left, levelNumber+1);
           getLeftView(node.right, levelNumber+1);
        }
    }

    public static void main(String[] args) {
        LeftView leftview = new LeftView();
        leftview.output = new ArrayList<>();

        root = new Node(1);
        root.left = new LeftView.Node(2);
        root.right = new LeftView.Node(3);
        root.left.left = new LeftView.Node(4);
        root.left.right = new LeftView.Node(5);
        root.right.right = new LeftView.Node(7);
        root.left.right.left = new LeftView.Node(6);

        leftview.getLeftView(root, 0);
        System.out.println(leftview.output);
    }

}
