package Extra;

import java.util.Queue;

public class JavaQueue {

    public int arr[];         // array to store queue elements
    private int front;         // front points to front element in the queue
    private int rear;          // rear points to last element in the queue
    private int capacity;      // maximum capacity of the queue
    private int count;         // current 

    // Constructor to initialize queue
    JavaQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void dequeue() {
        if (isEmpty()) {

        }
        int result = arr[0];
        //    count--;
        for (int i = 0; i < count; i++) {
            arr[i] = arr[i + 1];
            arr[count] = 0;

        }
        System.out.println("the dequeued element is " + result);
    }

    // Utility function to add an item to the queue
    public void enqueue(int item) {
        if (count == arr.length) {
           expandCapacity();
        } 
        rear++;
        arr[rear] = item;
        count++;
    }

    // Utility function to return front element in the queue
    public int peek() {
        return arr[capacity - 1];
    }

    // Utility function to return the size of the queue
    public int size() {
        return arr.length;
    }
// Utility function to check if the queue is empty or not

    public Boolean isEmpty() {
        if (capacity == 0) {
            return true;

        }
        return false;
    }

    // Utility function to check if the queue is empty or not
    public Boolean isFull() {
        if (capacity == arr.length) {
            return true;
        }
        return false;
    }

    public void expandCapacity() {
        int[] larger = new int[capacity * 2];
        for (int i = 0; i < larger.length; i++) {
            larger[i] = arr[i];
            arr = larger;
        }
        
    }

    @Override
    public String toString() {
        String result = " ";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + "\n";
        }
        return result;
    }

}
