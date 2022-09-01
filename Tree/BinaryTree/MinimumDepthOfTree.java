package Tree.BinaryTree;

public class MinimumDepthOfTree {

    static class Node{
        int data;
        Node left, right;

        Node(int d){
            left = right = null;
        }
    }

    private static int minDepthOfTree(Node node){

        if(node == null){
            return 0;
        }

        int leftDepth = minDepthOfTree(node.left);
        int rightDepth = minDepthOfTree(node.right);

        if(node.left == null){
            return 1+rightDepth;
        }
        if(node.right == null){
            return 1+leftDepth;
        }

        return Integer.min(leftDepth, rightDepth)+1;
    }

    public static void main(String[] args) {

        MinimumDepthOfTree tree = new MinimumDepthOfTree();

        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        node.left.left.right = new Node(8);
        node.left.right.right = new Node(9);
        node.right.right.left = new Node(10);
        node.right.right.left = new Node(11);
        node.left.left.right.right = new Node(12);

        System.out.println("minDepth : " + minDepthOfTree(node));
    }
}
