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
public interface stuff {

    /**
     * ** Insert a new item into the stuff. * * @param x the item to insert.
     */
    void push(Object x);

    /**
     * ** Remove the most recently inserted item from the stuff. ** * @exception
 UnderflowException if the stuff is empty.
     */
    void pop();

    /**
     * ** Get the most recently inserted item in the stuff. ** Does not alter *
 the stuff. * * @return the most recently inserted item in the stuff. *
     * @throws UnderflowException if the stuff is empty.
     */
    Object top();

    /**
     * ** Return and remove the most recently inserted item * from the stuff. * *
     * @return the most recently inserted item in the stuff. * @exception
 UnderflowException if the stuff is empty.
     */
    Object topAndPop();

    /**
     * Test if the stuff is logically empty. * * @return true if empty, false
     * otherwise.
     */
    boolean isEmpty();

    /**
     * ** Make the stuff logically empty.
     */
    void makeEmpty();
}
