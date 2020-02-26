
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
public class ex7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 6, 5};
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter position: ");
        int pos = kb.nextInt();
        
        for(int i=pos; i<arr.length-1;i++) {
            arr[i] = arr[i + 1];
        }
        for(int i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
