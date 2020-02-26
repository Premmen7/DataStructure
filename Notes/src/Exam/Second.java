/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author cstuser
 */
public class Second {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        queue.add(16);
        queue.add(17);
        queue.add(18);
        queue.add(19);
        queue.add(20);
        swap(queue);
        
        
    }
    
    public static void swap(Queue<Integer> queue) {
        Queue<Integer> temp1 = new LinkedList<>();
        Queue<Integer> temp2 = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        //i<queue.size() does not work
        for(int i = 0; i < 5; i++) {
            temp1.add(queue.poll());
        }
        for(int j = 0; j < 5; j++) {
            temp2.add(queue.poll());
        }
        
      
        System.out.println(temp1);
        System.out.println(temp2);
          for(int i = 0; i < 5; i += 2) {
            stack.add(temp1.poll());
        }
        for(int j = 1; j < 5; j += 2) {
            stack.add(temp1.poll());
        }
        System.out.println(stack);
        
        
    }
}
