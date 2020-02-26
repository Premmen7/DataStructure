
package Exam;

import java.util.*;

import java.util.*;

public class Seventh {

    public static int evaluate(String expression) {
        char[] exp = expression.toCharArray();

        
        Stack<Integer> operand = new Stack<Integer>(); 
        Stack<Character> operator = new Stack<Character>();

        for (int i = 0; i < exp.length; i++) {
            if (exp[i] == ' ') {
                continue;
            }
            if (exp[i] >= '0' && exp[i] <= '9') {
                StringBuffer read = new StringBuffer();
                while (i < exp.length && exp[i] >= '0' && exp[i] <= '9') {
                    read.append(exp[i++]);
                }
                operand.push(Integer.parseInt(read.toString()));
            } 
            else if (exp[i] == '(') {
                operator.push(exp[i]);
            }
            else if (exp[i] == ')') {
                while (operator.peek() != '(') {
                    operand.push(opperate(operator.pop(), operand.pop(), operand.pop()));
                }
                operator.pop();
            } 
            else if (exp[i] == '+' || exp[i] == '-'
                    || exp[i] == '*' || exp[i] == '/') {
                while (!operator.empty() && previous(exp[i], operator.peek())) {
                    operand.push(opperate(operator.pop(), operand.pop(), operand.pop()));
                }
                operator.push(exp[i]);
            }
        }
        
        while (!operator.empty()) {
            operand.push(opperate(operator.pop(), operand.pop(), operand.pop()));
        }

        return operand.pop();
    }

    public static boolean previous(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    // A utility method to apply an operator 'op' on operands 'a'  
    // and 'b'. Return the result. 
    public static int opperate(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(evaluate("6+8/2-2*2+5"));
      
    }

}
