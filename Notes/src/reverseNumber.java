
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
public class reverseNumber {
    public static void main(String[] args) {
        int number = 0;
        int reverse = 0;
        int remainder = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter my number");
        number = scan.nextInt();
        while(number!=0) {
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
        }
        System.out.println("The reversed number is " + reverse);
        
        int temp = reverse;
        int total = 0;
        
        while(reverse!=0) {
            remainder = reverse % 10;
            total = total + (remainder * remainder * remainder);
            reverse = reverse / 10;
        }
        if(total == temp) {
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
        
    }
}
