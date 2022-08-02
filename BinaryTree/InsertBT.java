package BinaryTree;

public class InsertBT {

   static class Node {
        int data;
        Node left, right;

        Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }

    public static void insertBT(Node node, int data){
        if(data<node.data){
            if(node.left != null){
                insertBT(node.left, data);
            }else{
                System.out.println("Insert Element  " + data +" to left  " + node.data);
                node.left = new Node(data);
            }
        }else if(data>node.data){
            if(node.right != null){
                insertBT(node.right, data);
            }else{
                System.out.println("Insert element  "+ data +" to right  "+ node.data);
                node.right = new Node(data);
            }
        }

//        System.out.println(node.data);

    }

    public static void main(String[] args) {

        Node rootNode = new Node(25);
        insertBT(rootNode,11);
        insertBT(rootNode,15);
        insertBT(rootNode,16);
        insertBT(rootNode,23);
        insertBT(rootNode,35);
        insertBT(rootNode,42);
        insertBT(rootNode,75);
        insertBT(rootNode,65);



    }
}
