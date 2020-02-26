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
public class Driver2 {
    private int [] arr;
    private int size, front, rear;
    
    private static final int CAPACITY = 16;
    
    public Driver2() {
        arr = new int[CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }
    
    public void enqueue(int data) {
        if(size()==arr.length) {
            rear++;
            arr[front] = data;
        }
    }
    
    public void dequeue() {
        
    }
    
    public int size() {
        return CAPACITY;
    }
    
    public String toString() {
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            result += arr[i] + "\n";
        }
        return result;
    }
    
    public static void main(String[] args) {
        Driver2 second = new Driver2();
        second.enqueue(2);
        second.enqueue(3);
        System.out.println(second);
    }
}
