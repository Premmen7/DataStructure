/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra;

import java.util.Arrays;
import java.util.Queue;

/**
 *
 * @author cstuser
 */
public class Demo {

    public static void main(String[] args) {

        JavaQueue queue = new JavaQueue(5);
        
        
         queue.enqueue(5);
         queue.enqueue(4);
         queue.enqueue(3);
         queue.enqueue(2);
         queue.enqueue(4);
         System.out.println(Arrays.toString(queue.arr));
         System.out.println(queue.size());
         queue.enqueue(5);
         System.out.println(Arrays.toString(queue.arr));
          System.out.println(queue.size());
       queue.enqueue(7);

      //  queue.dequeue();
       // queue.dequeue();

        System.out.println(Arrays.toString(queue.arr));
        System.out.println("=========");

        System.out.println("Is it empty? " + queue.isEmpty());
        System.out.println("Is it full? " + queue.isFull());
        
    }
}
