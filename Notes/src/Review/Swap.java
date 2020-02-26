package Review;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Swap {
    public static void swapStackValues(Stack<Object> stack) {
        Stack<Object> firstSwap = new Stack<>();
        Stack<Object> secondSwap = new Stack<>();

        while(!stack.isEmpty()) {
            firstSwap.add(stack.pop());
            secondSwap.add(stack.pop());
        }

        while(!secondSwap.isEmpty()) {
            while(!firstSwap.isEmpty()) {
                stack.add(firstSwap.pop());
                stack.add(secondSwap.pop());
            }
        }
    }

    public static void swapQueueValues(Queue<Object> queue) {
        Queue<Object> firstSwap = new LinkedList<>();
        Queue<Object> secondSwap = new LinkedList<>();

        while(!secondSwap.isEmpty()) {
            while (!firstSwap.isEmpty()) {
                queue.add(firstSwap.poll());
                queue.add(secondSwap.poll());
            }
        }
    }

    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);

        System.out.println("Stack unswapped: " + stack);

        swapStackValues(stack);

        System.out.println("Stack swapped: " + stack);

        Queue<Object> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println("\nQueue unswapped: " + queue);

        swapQueueValues(queue);

        System.out.println("Queue swapped: " + queue);
    }
}
