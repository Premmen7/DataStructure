package Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cstuser
 */
public class ArrayStack{

    //Initialize an array for the stuff
    private Object[] theArray;
    private int topOfStack;
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * ** Construct the stuff.
     */
    public ArrayStack() {
        topOfStack = 0;
        theArray = (Object[])(new Object[DEFAULT_CAPACITY]);
        
    }

    /**
     * ** Test if the stuff is logically empty. * * @return true if empty, false
     * otherwise.
     */
    public boolean isEmpty() {
        return topOfStack==0;
    }

    /**
     * ** Make the stuff logically empty.
     */
    public void makeEmpty() {
        for(int i = topOfStack; i>=0; i--) {
            pop();
        }
    }

    /**
     * ** Get the most recently inserted item in the stuff. ** Does not alter *
 the stuff. * * @return the most recently inserted item in the stuff.
     *
     *
     * @throws UnderflowException if the stuff is empty.
     */

    /**
     * ** Remove the most recently inserted item from the stuff. ** * @throws
 UnderflowException if the stuff is empty.
     */
    public void pop() {
        topOfStack--;
        Object result = theArray[topOfStack];
        theArray[topOfStack] = null;
    }

    /**
     * ** Return and remove the most recently inserted item * from the stuff.
     *
     * *
     * @return the most recently inserted item in the stuff. * @throws Underflow
 if the stuff is empty.
     */

    /**
     * ** Insert a new item into the stuff. * * @param x the item to insert.
     */
    public void push(Object x) {
        if(topOfStack==theArray.length)
            doubleArray();
        theArray[topOfStack]=x;
        topOfStack++;
    }

    /**
     * * Internal method to extend theArray.
     */
    private void doubleArray() {
    }
    
    public String toString() {
        String result = "";
        for(int i=0; i<topOfStack;i++) {
            result = result + theArray[i] + "\n";
        }
        return result;
    }
    
    

}
