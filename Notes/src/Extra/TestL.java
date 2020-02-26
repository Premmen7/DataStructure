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
public class TestL {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3);
        list = LinkedList.insert(list, 4);
        list = LinkedList.insert(list, 5);
        list = LinkedList.insert(list, 6);
        list = LinkedList.insert(list, 7);
        list = LinkedList.insert(list, 8);
        list.printList(list);
         list = LinkedList.deleteAtPosition(list, 0);
            list.printList(list);
        list = LinkedList.deleteAtPosition(list, 4);
        list.printList(list);
      
    }
}
