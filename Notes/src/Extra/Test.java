/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra;

import java.util.Arrays;


public class Test {

    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("Stack using Array ");
        System.out.println("******************************************");
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push(7);
        arrayStack.push(4);
        arrayStack.push(9);
        arrayStack.push(14);
        arrayStack.push(3);
        System.out.println(arrayStack);
        arrayStack.pop();
        arrayStack.pop();
       

        System.out.println("===============");
        System.out.println(arrayStack);
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.top());

    }
}
