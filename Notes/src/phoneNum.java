
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
public class phoneNum {

    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        System.out.println("enter a:");
//        int a = kb.nextInt();
//        System.out.println("enter b:");
//        int b = kb.nextInt();
//        int trial = a;
//        a = b;
//        b = trial;
//        System.out.println(b);
//        a = a + b;
//        b = a - b;
//        System.out.println(b);
//        System.out.println(a);
        int[] marks = new int[10];
        float avg = 0;
        int total = 0;
        
        Scanner scan = new Scanner(System.in);
        
        for(int i =1; i <= 5; i++) {
            System.out.println("Please enter the " + i + " th value");
            marks[i] = scan.nextInt();
            total = total + marks[i];
        }
        avg = total / 5;
        System.out.println(avg);
        
        if(avg >= 90) {
            System.out.println("Grade A");
        }
        else if(avg >= 80) {
            System.out.println("Grade B");
        }
        else if(avg >= 70) {
            System.out.println("Grade C");
        }
        else if(avg >= 60) {
            System.out.println("Grade D");
        }
        else
            System.out.println("Grade F");
            
    }

}
