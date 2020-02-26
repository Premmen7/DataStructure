/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.Stack;

public class PostfixInfix {
    public static void main(String[] args) {
        String og = "abc-+de-fg-h+/*";
        System.out.println(infix(og));
    }

    public static boolean operate(char opp) {

        return (opp >= 'a' && opp <= 'z') || (opp >= 'A' && opp <= 'Z');
    }

    public static String infix(String og) {
        Stack<String> list = new Stack<>();
        for (int i = 0; i < og.length(); i++) {
            if (operate(og.charAt(i))) {
                list.push(og.charAt(i) + "");
            } else {
                String first = list.peek();
                list.pop();
                String second = list.peek();
                list.pop();
                list.push("(" + second + og.charAt(i) + first + ")");
            }
        }
        return list.peek();
    }
}
