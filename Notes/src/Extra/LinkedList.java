/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra;


/**
 *
 * @author cstuser
 */
public class LinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.println("LinkedList: ");

        while (currNode != null) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static LinkedList deleteAtPosition(LinkedList list, int index) {
        Node currNode = list.head,
                prev = null,
                temp = null;

        if (index == 0) {
            list.head = currNode.next;

        } else {
            int count = 0;
            while (currNode != null && index > 0) {
                prev = currNode;
                currNode = currNode.next;
                count++;
                if (count == index) {
                    prev.next = currNode.next;
                }
            }
           
        }

        return list;
    }

}
