/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.LinkedList;

/**
 *
 * @author cstuser
 */
public class Third {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(1);
        list.add(6);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.add(9);
        list2.add(2);
        
        //Reverse
        reverse(list);
        reverse(list2);
        System.out.println("Reverse Sum");
        sum(list, list2);
        System.out.println("");
        
        //Reverse
        reverse(list);
        reverse(list2);
        System.out.println("Forward order sum");
        sum(list, list2);
        
        
        
        
        
    }
    
    public static void reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reverse = new LinkedList<>();
        for(int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }
        list.removeAll(list);
        list.addAll(reverse);
    }
    
    public static void sum(LinkedList<Integer> list, LinkedList<Integer> list2) {
        String x = "";
        String y = "";
        for(int i = 0; i < list.size(); i++) {
            x += list.get(i) + "";
        }
        for(int j = 0; j < list2.size(); j++) {
            y += "" + list2.get(j);
        }
        int numberOne = Integer.parseInt(x);
        int numberTwo = Integer.parseInt(y);
        
        System.out.println("" + numberOne + " + " + numberTwo + " = " + numberOne+numberTwo);
        
        
    }
    
    
}
