package LinkedList;

public class MoveZero {

    static Node head;

    static class Node {
        
        int data;
        Node next;

        
    }

    static Node push(Node newhead, int newData){
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = newhead;
        newhead = newNode;

        return newNode;
    }

    static Node moveZero(Node head){
        if(head == null)
            return null;

        Node temp = (head).next, prev = head;

        while(temp != null){
            if(temp.data == 0){
                Node curr = temp;
                temp = temp.next;
                prev.next = temp;

                // move zero to biginning

                curr.next = (head);
                head = curr;
            }

            else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }

    static void print(Node head){

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }
    

    public static void main(String[] args) {

        LinkedList llist = new LinkedList();

        Node head = null;

         /* Use push() to construct the list */
        head = push(head, 0);
        head = push(head, 3);
        head = push(head, 0);
        head = push(head, 2);
        head = push(head, 0);
        head = push(head, 1);
        head = push(head, 0);
        head = push(head, 1);
        head = push(head, 0);
        head = push(head, 0);

        print(head);
        System.out.println();
        head = moveZero(head);

        print(head);

    }
}
