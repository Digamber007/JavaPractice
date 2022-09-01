package LinkedList;

public class FindDuplicateElements {

    static class Node{
        int data;
        Node next;

    }

    static Node insert(Node head, int item){
        Node temp = new Node();
        temp.data = item;
        temp.next = head;
        head = temp;

        return head;
    }

    static int countNode(Node head){
        int count = 0;

        while(head.next != null){
            Node temp = head.next;
            while(temp != null){
                if(head.data == temp.data){
                    count++;
                    break;
                }
                temp = temp.next;
            }
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 5);
        head = insert(head, 7);
        head = insert(head, 5);
        head = insert(head, 1);
        head = insert(head, 7);

        System.out.println( countNode(head));
    }
}
