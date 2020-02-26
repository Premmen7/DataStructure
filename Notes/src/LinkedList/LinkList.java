/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.List;

/**
 *
 * @author cstuser
 */
// a Singly Linked List 
public class LinkList {

    Node head; // head of list
    Node head2;

    // Method to insert a new node 
    public LinkList insert(LinkList list, int data) {
        // Create a new node with given data 
        Node node = new Node(data);
        node.next = null;

        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) {
            list.head = node;
        } else {
            Node current = list.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;

        }

        // Return the list by head 
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkList list) {
        Node currNode = list.head;

        System.out.print("LinkedList:\n");
        while (currNode != null) {
            System.out.println(currNode.element);
            currNode = currNode.next;
        }
    }

    // Method to delete a node in the LinkedList by POSITION 
    public LinkList deleteAtPosition(LinkList list, int index) {
        // Store head node 
        Node currNode = list.head;
        Node prev = null;

        // 
        // CASE 1: 
        // If index is 0, then head node itself is to be deleted 
        // write some code
        int counter = 0;
        if (index == 0) {
            list.head = currNode.next;

        } // CASE 2: 
        // If the index is greater than 0 but less than the size of LinkedList 
        else {
            while (currNode != null) {
                prev = currNode;
                currNode = currNode.next;
                index++;
                if (counter == index) {
                    prev.next = currNode.next;
                }
            }
        }

        // Count for the index to be deleted, 
        // keep track of the previous node 
        // as it is needed to change currNode.next 
        // write some code
        // If the position element was found, it should be at currNode 
        // Therefore the currNode shall not be null 
        // 
        // CASE 3: The index is greater than the size of the LinkedList 
        // 
        // In this case, the currNode should be null 
        // write some code
        // return the List 
        return list;
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.element == data) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;

    }
    
    public void merge(LinkList list, LinkList list2) {
        Node head1 = list.head;
        Node head2 = list2.head;
        while(head1.next!=null) {
            head1 = head1.next;
        }
        head1.next = head2;
      
    }
    
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node temp;
        while(current!=null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
    }
}
