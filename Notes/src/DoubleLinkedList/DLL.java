/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

/**
 *
 * @author cstuser
 */
public class DLL {

    Node head; // head of list 

    /* Doubly Linked list Node*/
    class Node {

        int data;
        Node prev;
        Node next;

        // Constructor to create a new node 
        // next and prev is by default initialized as null 
        Node(int d) {
            data = d;
        }
    }

    // Adding a node at the front of the list 
    public void push(int new_data) {
        Node current = new Node(new_data);

        current.next = head;
        head.prev = current;
        current.prev = null;
        head = current;
        /* 3. Make next of new node as head and previous as NULL */

        // Write some coide
        /* 4. change prev of head node to new node */
        // Write code
        /* 5. move the head to point to the new node */
        // write code
    }

    public void insert(int index, int data) {
        Node newnode = new Node(data);
        Node p = head;
        Node temp;
        while (p.data != index) {
            p = p.next;
        }
        temp = p.next;
        p.next = newnode;
        newnode.prev = p;
        temp.prev = newnode;

    }

    public void end(int data) {
        Node newnode = new Node(data);
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newnode;
        newnode.prev = p;
        newnode.next = null;
    }
    
    public void deleteFirst(int data) {
        Node p = head;
        head = head.next;
        head.prev = null;
    }
    
    public void delete(int index, int data) {
        Node p = head;
        Node temp1;
        Node temp2;
        while(p.data!=index) {
            p=p.next;
        }
        temp1 = p.next;
        temp2 = p.prev;
        temp2.prev = temp1;
    }
    
    public void deleteEnd(int data) {
        Node p = head;
        while(p.next != null) {
            p = p.next;
        }
        Node temp = p.prev;
        temp.next = null;
    }
    
    public void reverse(int data, int index) {
        Node current = head;
        while(current!=null) {
            Node temp = current.prev;
            current.prev = current.next;
            current.next = temp;
        }
    }
        /* Given a node as prev_node, insert a new node after the given node */
    public void InsertAfter(Node prev_Node, int new_data) {

        Node current = new Node(new_data);
        /*1. check if the given prev_node is NULL */
        if (prev_Node == null) {
            prev_Node = current;
        } else {
            prev_Node.next = current;
        }

        // write code
        /* 
        * 3. put in the data */
 /* 4. Make next of new node as next of prev_node */
 /* 5. Make the next of prev_node as new_node */
 /* 6. Make prev_node as previous of new_node */
 /* 7. Change previous of new_node's next node */
        // write some coide
        // Add a node at the end of the list 
    }

    void append(int new_data) {
        /* 1. allocate node  
        * 2. put in the data */
 /* 3. This new node is going to be the last node, so 
        * make next of it as NULL*/
 /* 4. If the Linked List is empty, then make the new 
        * node as head */
 /* 5. Else traverse till the last node */
 /* 6. Change the next of last node */
 /* 7. Make last node as previous of new node */

        // write some code
    }

    // This function prints contents of linked list starting from the given node 
    public void printlist(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    /* Drier program to test above functions*/
    public static void main(String[] args) {
        /* Start with the empty list */
        DLL dll = new DLL();

        // Insert 6. So linked list becomes 6->NULL 
        //dll.append(6); 
        // Insert 7 at the beginning. So linked list becomes 7->6->NULL 
        dll.push(7);

        // Insert 1 at the beginning. So linked list becomes 1->7->6->NULL 
        dll.push(1);
        dll.push(11);

        // Insert 4 at the end. So linked list becomes 1->7->6->4->NULL 
        //dll.append(4); 
        // Insert 8, after 7. So linked list becomes 1->7->8->6->4->NULL 
        //dll.InsertAfter(dll.head.next, 8); 
        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
    }
}
