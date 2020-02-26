/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author cstuser
 */
public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("John");
        set.add("Jaack");
        set.add("Jim");
        set.add("Joe");
        set.add("Johnny");
        set.add("Johnny");
        System.out.println(set);
        
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }
        
        set.remove("Johnny");
        System.out.println(set);
        
        if(set.contains("Jim")) {
            System.out.println("Jim is in the set");
        }
    }
    
}
