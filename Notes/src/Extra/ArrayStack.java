/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra;

/**
 *
 * @author cstuser
 */
public class ArrayStack implements JavaStack {

    private Object[] theArray;
    private int topOfStack;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        topOfStack = 0;
       // theArray = (Object [])(new Object [10]);//Typecasting???!
        theArray = new Object [10];
    }

    
    @Override
    public boolean isEmpty() {
        if(topOfStack == 0){
            return true;
            
        }
        return false;
    }

    @Override
    public void makeEmpty() {
     //theArray.
    }

    @Override
    public Object top() {
      return theArray[topOfStack -1 ];
    }

    @Override
    public void pop() {
        if(isEmpty()){
            
        }
       topOfStack--;
       Object result = theArray[topOfStack];
       theArray[topOfStack] = null;
          
    }

    @Override
    public Object topAndPop() {
        theArray[topOfStack] = null;
        topOfStack--;
        return theArray[topOfStack];
    }

    
    @Override
    public void push(Object x) {
        if(topOfStack == theArray.length){
            doubleArray();
        }
        theArray[topOfStack] = x;
        topOfStack++;
    }

    private void doubleArray(){
        Object[] larger = (Object[])(new Object[theArray.length * 2]);
        for(int i = 0; i < theArray.length;i++){
            larger[i] = theArray[i];
            theArray = larger;
        }
    }
    @Override
    public String toString(){
        String result = " ";
        for(int i = 0; i < topOfStack;i++){
            result += theArray[i]+ "\n";
      
        }return result;
    }

}
