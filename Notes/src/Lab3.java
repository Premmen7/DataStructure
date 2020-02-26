/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cstuser
 */
public class Lab3 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for(int j=0; j<n-i;j++) {
                System.out.print(".");
            }
            System.out.println(i);
        }
    }
}
