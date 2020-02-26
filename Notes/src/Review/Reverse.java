package Review;


import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void swapStack(Stack<Object> stack) {
        Scanner kb = new Scanner(System.in);
        Stack<Object> firstPart = new Stack<>();
        Stack<Object> secondPart = new Stack<>();
        System.out.println("Enter the position to start reversing: ");
        int startingPoint = kb.nextInt();
        int counter = 0;

        //Check if the starting point is out of range
        if(startingPoint > stack.size()) {
            System.out.println("Starting point is greater than the size of the stack");
        }

        //Take the values up to the starting point and put them in the firstPart stack
        while(counter != startingPoint) {
            firstPart.add(stack.pop());
            counter++;
        }

        //Take the remaining values in the stack and put them in the secondPart stack
        while(!stack.isEmpty()) {
            secondPart.add(stack.pop());
        }

        //Put the firstPart back in the stack but it will be in the back now
        while(!firstPart.isEmpty()) {
            stack.add(firstPart.pop());
        }

        //Put the secondPart back in the stack but it will be in the front
        while(!secondPart.isEmpty()) {
            stack.add(secondPart.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Object> stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println("Stack before swap: " + stack);
        swapStack(stack);
        System.out.println("Stack after swap: " + stack);
    }
}
