package Assignment1;

import java.util.Stack;

public class Matrix {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 1},
                {2, 2, 3},
                {4, 5, 3},
                {5, 8, 7}
        };
        insert(array);
    }
//  1  2   1   2   2   3   4   5   3   5   8   7
    public static void insert(int[][] x) {
        Stack<Integer> stack = new Stack<>();
        int number = 0;
        int temp = 0;
        int counter = 1;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                stack.add(x[i][j]);
            }
        }
        System.out.print("The repeated numbers are: ");
        for(int i = 0; i < stack.size(); i++) {
            for(int j = i + 1; j < stack.size(); j++) {
                if(stack.get(i) == stack.get(j)) {
                    counter++;
                    number = stack.get(i);
                    System.out.print(number + "(" + counter + " times), ");
                }
            }
            number = 0;
            counter = 1;
        }

    }
}
