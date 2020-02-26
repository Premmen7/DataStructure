/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author cstuser
 */
public class Driver {

    private int arr[];  //array to Reverse queue elements
    private int front;  //front points to front element in the queue
    private int rear;   //rear points to last elements in the queue
    private int capacity;   //maximum capacity of the queue
    private int count;      //current size of the queue

    public Driver(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = 0;
        count = 0;
    }
    
    //Utility function to remove front element from the queue
    public void dequeue() {
        int deq = arr[0];
       count--;
        //shift the elements
        for(int i=0; i<count; i++) {
            arr[i] = arr[i+1];
        }
        arr[count] = 0;
        System.out.println("dequeued element is " + deq);
    }

    //Utility function to add an item to the queue
    public void enqueue(int item) {
        if(size()==arr.length)
            expandCapacity();
        arr[count] = item;
        count++;
    }
    
    //Utility function to return front element in the queue
  //  public int peek() {
        
  //  }
    
    //Utility function to return the size of the queue
    public int size() {
        return capacity;
    }
    
    //Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return capacity == 0;
    }
    
    //Utility function to check if the queue is empty or not
    public boolean isFull() {
        return capacity == arr.length;
    }
    
    private void expandCapacity() {
        int[] larger = new int[arr.length * 2];
        for(int i=0; i<arr.length;i++) {
            larger[i] = arr[i];
            
        }
            arr = larger;
        
    }
    
    public String toString() {
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            result += arr[i] + "\n";
        }
        return result;
    }
    
    //Queue implementation in java
    public static void main(String[] args) {
        Driver first = new Driver(4);
        first.enqueue(3);
        first.enqueue(5);
        first.enqueue(7);
        first.enqueue(10);
           first.enqueue(8);
        first.enqueue(2);
        first.enqueue(4);
        first.enqueue(16);
        System.out.println(first);
         
    }

}
