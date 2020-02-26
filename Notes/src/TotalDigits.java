/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cstuser
 */
public class TotalDigits {
    public static void main(String[] args) {
        int num = 54453;
        int remainder = 0;
        int evenDigits = 0;
        int oddDigits = 0;
        
        while(num!=0) {
            remainder = num%10;
            if(remainder%2==0) {
                evenDigits++;
            }
            else{
                oddDigits++;
            }
            num = num/10;
        }
    }
}
