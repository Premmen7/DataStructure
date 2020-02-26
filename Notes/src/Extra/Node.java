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
public class Node {
    
    private Object element;
    private Node next;
    
    public Node(){
        this(null, null);
    }
    public Node (Object e, Node n){
        element = 0;
        next = n;
    }
    Object getElement(){
        return element;
    }
    Node getNext(){
        return next;
        
    }
    void setElement (Object newELem){
        element = newELem;
    }
    void setNext (Node newNext){
        next = newNext;
    }
}
