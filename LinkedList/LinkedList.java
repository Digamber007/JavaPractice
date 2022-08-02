package LinkedList;

import java.io.*;
import java.util.*;


public class LinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // recurcive method...............
    public static Node reverseList(Node head) {

        if(head == null || head.next == null)
            return head;

            Node rest = reverseList(head.next);
            head.next.next = head;

            head.next = null;

            return rest;
        
    }

    // Iterative method.............................

    public static Node reverseLL(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;

    }

    void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        llist.head.next = new Node(2);
        llist.head.next.next = new Node(3);
        llist.head.next.next.next = new Node(4);
        llist.head.next.next.next.next = new Node(5);


        System.out.println("Given linked list");
        llist.printList(head);

        head = reverseLL(head);
        
        System.out.println("Recursive-Reversed Linked list");
        llist.printList(head);

        System.out.println("Iterative-Reversed Linked list");
        llist.printList(head);

    }

    public void push(char c) {
    }

    public boolean isPalindrome(LinkedList.Node head2) {
        return false;
    }

}
