package BST;

public class LCAOfBinarySearchTree {

//    Node root;
    static class Node{
        int data;
        Node left, right;

        Node(int value){
            data = value;
            left = right = null;
        }
    }

    // insert the value into tree
    static Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        if(value<node.data){
            node.left = insert(node.left,value);
        }else{
            node.right = insert(node.right,value);
        }
        return node;
    }

    // search a node in tree
    static boolean search(Node node, Node value){
        while(node != null){
            if(value.data < node.data){
                node = node.left;
            }
            else if(value.data > node.data){
                node = node.right;
            }
            else if(value == node){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    static Node LCABst(Node node, Node a, Node b){
        if(node == null){
            return null;
        }
        if(node.data > Integer.max(a.data, b.data)){
            return LCABst(node.left,a,b);
        }
        else if(node.data < Integer.min(a.data,b.data)){
            return LCABst(node.right,a,b);
        }
        return node;
    }

    static void printLCABst(Node node, Node a, Node b){
        if(node == null || !search(node,a) || !search(node, b)){
            return;
        }
        Node LCA = LCABst(node, a, b);

        if(LCA != null){
            System.out.println(LCA.data);
        }
        else{
            System.out.println("LCA does not exist");
        }
    }

    public static void main(String[] args) {
            int[] nodes = {15, 10, 20, 8, 12, 16, 25};

            Node node = null;
            for (int value: nodes){
                node = insert(node,value);
            }

            printLCABst(node,node.left.left,node.left.right);
    }

   /* Construct the following tree
                  15
                /   \
               /     \
              10     20
             / \     / \
            /   \   /   \
           8    12 16   25

        */
}
