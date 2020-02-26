/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author cstuser
 */
public class Driver {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("John");
        list1.add("Joe");
        list1.add("Jim");

        ArrayList list2 = new ArrayList();
        list2.add(10);
        list2.add("John");
        list2.add('e');

        System.out.println("List 1 is" + list1);
        System.out.println("List 2 is" + list2);

        String name = list1.get(1);
        System.out.println(name);

        Object o = list2.get(3);
        System.out.println(o);

        //Update element in list
        list1.set(2, "Fionna");
        System.out.println(list1);

        //Remove element from the list
        list1.remove(2);

        //Remove all
        //list1.clear();
        if (list1.contains("John")) {
            System.out.println("John is in the list");
        }

        //Iterate the arraylist
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        for (String str : list1) {
            System.out.println(str);
        }

        Iterator<String> itr = list1.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());

        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if (str.equals("Joe")) {
                itr.remove();
            }
        }
    }
}
