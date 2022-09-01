package LinkedList;

public class MergeTwoSortedLL {

    static class Node{
        int data;
        Node next;

        Node(int d, Node next){
            data = d;
            next = null;
        }
    }

    static void print( Node node){
        Node temp = node;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

   static Node reverseMerge(Node a, Node b){
        Node res = null;
        while (a != null && b != null){
            if(a.data <b.data){
                Node newNode = a;
                a = a.next;

                newNode.next = res;
                res = newNode;
            }
            else{
                Node newNode = b;
                b = b.next;

                newNode.next = res;
                res = newNode;
            }
        }

        while (b != null){
            Node newNode = b;
            b = b.next;

            newNode.next = res;
            res = newNode;
        }

        while (a != null){
            Node newNode = a;
            a = a.next;

            newNode.next = res;
            res = newNode;
        }

        return res;

    }

    public static void main(String[] args) {
        Node a = null, b = null;

        for(int i=6; i>0; i=i-1){
            a = new Node(i, a);
        }

        for(int i=5; i<=10; i++){
            b = new Node(i, b);
        }

        print(a);
        System.out.println();
        print(b);

        System.out.println();

        Node head = reverseMerge(a,b);
        print(head);
    }

}
