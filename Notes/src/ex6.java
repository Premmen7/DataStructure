
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cstuser
 */
public class ex6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 6, 5};
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter position: ");
        int pos = kb.nextInt();
        System.out.println("Enter value: ");
        int value = kb.nextInt();
        
        for(int i=arr.length-1;i>pos;i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = value;
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
