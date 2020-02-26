
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
public class Arrays {
    public static void main(String[] args) {
        int[][] mat1 ={{3,4},{1,5}};
        int[][] mat2={{1,5},{3,7}};
        int[][] mat3=new int[2][2];
        
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                mat3[i][j]=mat1[i][j] + mat2[i][j];
            }
        }
        
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.println(mat3[i][j] + " ");
            }
        }
        
        
        
        
        
        
    }

    static void sort(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
