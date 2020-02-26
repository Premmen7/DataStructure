/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author cstuser
 */
public class First {
    
    public static void removeDupe(Stack<Integer> stack) {
        for(int i = 0; i < stack.size(); i++) {
            for(int j = i + 1; j < stack.size(); j++) {
                if(stack.get(i) == stack.get(j)) {
                    stack.remove(j);
                }
            }
        }
        System.out.println(stack);
        
    }
    
    public static void sort(Stack<Integer> stack) {
        Collections.sort(stack);
        System.out.println(stack);
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(6);
        stack.add(5);
        stack.add(2);
        stack.add(3);
        stack.add(1);
        stack.add(3);
        stack.add(2);
        stack.add(1);
        stack.add(4);
        stack.add(2);
        stack.add(4);
        stack.add(5);
        removeDupe(stack);
        sort(stack);
    }
}
