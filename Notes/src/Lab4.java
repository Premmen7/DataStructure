
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
public class Lab4 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String random = kb.nextLine();
        int length = random.length();
        int counterforabc = 0;
        int counterfordigit = 0;
        int counterforspace = 0;
        int counterforothers = 0;
        for (int i = 0; i < length; i++) {
            if (Character.isAlphabetic(random.charAt(i))) {
                counterforabc++;
            }
            else if (Character.isDigit(random.charAt(i))) {
                counterfordigit++;
            }
            else if (random.charAt(i) == ' ') {
                counterforspace++;
            }
            else
                counterforothers++;
        }
        System.out.println("Alphabet:" + counterforabc + " Space:" + counterforspace + " Digits:" + counterfordigit + " others:" + counterforothers);
    }
}
