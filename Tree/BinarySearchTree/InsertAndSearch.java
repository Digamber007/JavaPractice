package Tree.BinarySearchTree;

public class InsertAndSearch {

    Node root;

    static class Node{
        int data;
        Node left, right;

        Node(int d){
            data = d;
            left = right = null;
        }
    }
    static void inorder(Node node){
        if(node == null){
            return;
        }

        inorder(node.left);
        System.out.print(node.data +" ");
        inorder(node.right);
    }
    public static Node insertElement(Node node, int d){
        if(node == null) {
            return new Node(d);
        }

        if(d < node.data){
            node.left = insertElement(node.left, d);
        }
        else {
            node.right = insertElement(node.right, d);
        }
        return node;
    }

    public static Node constructBST(int[] datas){
        Node node = null;
        for(int data: datas){
            node = insertElement(node, data);
        }
        return node;
    }

    public boolean searchElement(int d){
        return searchElement(root, d) != null ? true : false;
    }
    public Node searchElement(Node node, int d){
        if(node == null || node.data == d){
            return node;
        } else if (d < node.data) {
            return searchElement(node.left, d);
        }
        return searchElement(node.right, d);
    }

    public static void main(String[] args) {

        InsertAndSearch bst = new InsertAndSearch();

        int[] datas = { 15, 10, 20, 8, 12, 16, 25 };

        Node root = constructBST(datas);
        inorder(root);

        System.out.println();
        System.out.println("Search : "+ bst.searchElement(8));
    }
}
