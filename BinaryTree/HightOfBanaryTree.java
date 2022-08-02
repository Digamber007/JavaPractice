package BinaryTree;

public class HightOfBanaryTree {

    Node root;
    static class Node{
        int val;
        Node left, right;

        Node(int i){
            val = i;
            left = right = null;
        }
    }

     int hightOfTree(Node node){

        if(node==null){
            return -1;
        }
        else{
//
//            return 1 + Math.max(hightOfTree(node.left), hightOfTree(node.right));  // it will show correct answer


            int leftDepth = hightOfTree(node.left);
            int rightDepth = hightOfTree(node.right);

            if(leftDepth > rightDepth){
                return (leftDepth +1);
            }
            else{
                return (rightDepth +1);
            }
        }
    }

    public static void main(String[] args) {
        HightOfBanaryTree tree = new HightOfBanaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);


        System.out.println("Height of tree is : " +
                tree.hightOfTree(tree.root));
    }
}
