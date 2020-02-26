package Review;

import java.util.LinkedList;
import java.util.Queue;

public class Search {
    public static void maxAndMin(Queue<Integer> queue) {
        Queue<Integer> temp = new LinkedList<>();
        int min = 0;
        int minTemp;
        for(int i = 0; i < queue.size(); i++) {
            minTemp = queue.poll();
            if(minTemp < min) {
                min = minTemp;
            }
            queue.add(minTemp);
        }
        temp.add(min);

        int max = 0;
        int maxTemp;

        for(int i = 0; i < queue.size(); i++) {
            maxTemp = queue.poll();
            if(maxTemp > max) {
                max = maxTemp;
            }
            queue.add(maxTemp);
        }
        temp.add(max);

        while(!queue.isEmpty()) {
            queue.poll();
        }
        while (!temp.isEmpty()) {
            queue.add(temp.poll());
        }

        System.out.println("Smallest value in the queue: " + min);
        System.out.println("Largest value in the queue: " + max);

        System.out.println("Remaining values in the queue: " + queue);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(44);
        queue.add(122);
        queue.add(-4);
        queue.add(10);
        queue.add(11);
        queue.add(0);
        queue.add(99);
        maxAndMin(queue);
    }
}
