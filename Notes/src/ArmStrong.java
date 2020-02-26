/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cstuser
 */
public class ArmStrong {
    public static void main(String[] args) {
        int num = 159;
        int temp = num;
        int remainder = 0;
        int total = 0;
        
        while(num!=0) {
            remainder = num % 10;
            total = total + (remainder * remainder * remainder);
            num = num / 10;
        }
        if(total == temp) {
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
    }
}
