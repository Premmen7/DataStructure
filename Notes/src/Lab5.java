
import java.util.Random;
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
public class Lab5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 100 + 1);
        System.out.println("Guess the secret number: ");
        int user = kb.nextInt();
        while(user!=secretNumber) {
            if(secretNumber > user) {
                System.out.println("Go Higher");
                user = kb.nextInt();
            }
            else if(secretNumber < user) {
                System.out.println("Go Lower");
                user = kb.nextInt();
            }
        }
        System.out.println("Number Matched");
    }
}
