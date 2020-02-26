/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author cstuser
 */
public class Driver {
    // Reverse code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkList list = new LinkList();
        LinkList list2 = new LinkList();

        // 
        // ******INSERTION****** 
        // 
        // Insert the values 
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);
        list.insert(list, 6);
        list.insert(list, 7);
        list.insert(list, 8);
      
        list2.insert(list, 100);
        list2.insert(list, 29);
        list2.insert(list, 93);
        list2.insert(list, 112);
        list2.insert(list, 02);
        list2.insert(list, 12);
        list2.insert(list, 90);
        
    //    list.merge(list, list2);

        // Print the LinkedList 
        list.printList(list);
        
    }
}
