
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
public class Lab1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number to factorial");
        int value = kb.nextInt();
        int total = value;
        int counter = value;
        for(int i = value; i>1; i--) {
            counter--;
            total = total * counter;
        }
        System.out.println(total);
        
    }
    
    
}
