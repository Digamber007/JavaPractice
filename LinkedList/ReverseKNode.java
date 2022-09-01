package LinkedList;

import java.util.Arrays;

public class ReverseKNode {

    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        public void printList() {
            Node temp = this;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static Node reverseNode(Node head, int k){
        if(head == null){
            return null;
        }
        Node curr = head;
        Node prev = null;
        int count = 0;

        while (curr != null && count++ < k){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = reverseNode(curr, k);

        return prev;
    }

    public static void main(String[] args) {

        int[] lists = { 1, 2, 3, 4, 5, 6, 7, 8 };

        Node head = null;
        for(int i=lists.length-1; i>=0; i--){
            head = new Node(lists[i], head);
        }
        head = reverseNode(head, 3);

        System.out.print(Arrays.toString(lists));
        System.out.println();
        head.printList();
    }
}
