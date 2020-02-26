/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cstuser
 */
public class Lab2 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int previous = 0;
        int total = 0;
        System.out.println(first);
        System.out.println(second);
        for(int i = 0; i<10; i++) {
            total = first + second;
            System.out.println(total);
            first = second;
            second = total;
        }
    }
}
