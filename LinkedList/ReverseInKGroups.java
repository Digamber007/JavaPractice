package LinkedList;

public class ReverseInKGroups {

    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    Node reverse(Node head, int k){
        if(head == null){
            return null;
        }

        Node curr = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        while(count < k && curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if(next != null){
            head.next = reverse(next, k);
        }

        return prev;
    }

    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

     void printList(){
        Node temp = head;
       while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseInKGroups list = new ReverseInKGroups();
            list.push(9);
            list.push(8);
            list.push(7);
            list.push(6);
            list.push(5);
            list.push(4);
            list.push(3);
            list.push(2);
            list.push(1);

        System.out.println("given List");
        list.printList();

        list.head = list.reverse(list.head, 3);
        System.out.println("reverse list in k group");
        list.printList();
    }
}
