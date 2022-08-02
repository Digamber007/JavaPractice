package RoughWork.Tree;

import java.util.ArrayList;
import java.util.List;

public class RightView {

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

    private void getRightView(Node node, int levelNumber){

        if(node != null){
            if(levelNumber == output.size()){
                output.add(node.data);
            }
            getRightView(node.right, levelNumber+1);
            getRightView(node.left,levelNumber+1);
        }
    }

    public static void main(String[] args) {
        RightView rightView = new RightView();
        rightView.output = new ArrayList<>();

        root = new RightView.Node(1);
        root.left = new RightView.Node(2);
        root.right = new RightView.Node(3);
        root.left.left = new RightView.Node(4);
        root.left.right = new RightView.Node(5);
        root.right.right = new RightView.Node(7);
        root.left.right.left = new RightView.Node(6);

        rightView.getRightView(root,0);
        System.out.println(rightView.output);
    }
}
