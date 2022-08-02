package LinkedList;

public class ReverseBetween {
    Node head;
    public class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next =null;

        }
    }
 

    Node reverseBetween(Node head, int left, int right){

        Node curr = head, prev = null;
        int i;
        for (i = 1; i < left; i++) {
            prev = curr;
            curr = curr.next;
        }
        Node start = curr;
        Node end = null;
        while (i <= right) {
            Node next = curr.next;
            curr.next = end;
            end = curr;
            curr = next;
            i++;
        }
        if (prev != null)
            prev.next = end;
        else
            head = end;
        start.next = curr;
        return head;
    }

    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    public void printList(){

        while (head != null){
            System.out.println(head.data+" ");
            head.next = head;
//            break;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ReverseBetween list = new ReverseBetween();

            list.push(1);
            list.push(2);
            list.push(3);
            list.push(4);
            list.push(5);

            System.out.println("given List");
            list.printList();

            list.head = list.reverseBetween(list.head, 2, 4);
            System.out.println("reverse list in Between/ center");
            list.printList();
    }
}
