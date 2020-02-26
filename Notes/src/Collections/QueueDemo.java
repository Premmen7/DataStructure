/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.PriorityQueue;

/**
 *
 * @author cstuser
 */
public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=1; i<10; i++) {
            queue.add(i);
        }
        
        System.out.println(queue);
        
        System.out.println(queue.size());
        //head of queue
        System.out.println(queue.peek());
        
        //remove the head of the queue
        System.out.println(queue.poll());
        System.out.println(queue);
        
    }
}
