package RoughWork.Tree;

public class LowestCommonAncestor {

    class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node root;
    LowestCommonAncestor(){
        root = null;
    }

    Node insertTree(Node node, int key){
        if(node == null){
            return new Node(key);
        }
        if(node.data> key){
            root.left = insertTree(node.left, key);
        }
        if(node.data< key){
            root.right = insertTree(node.right, key);
        }
        return node;
    }

    Node search(Node node, int key){
        if(node == null || node.data == key){
            return node;
        }
        if(node.data>key)
            return search(node.left,key);

            return search(node.right, key);

    }

//    void LCA(Node node, int n, int m){
//       // if(node == null || search(node,n) || search(node,m)){
//            return;
//        }
//        return
//    }

    public static void main(String[] args) {
        int[] arr = { 15, 10, 20, 8, 12, 16, 25 };
    }
}
