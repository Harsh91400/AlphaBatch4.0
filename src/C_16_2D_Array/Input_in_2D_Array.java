package C_16_2D_Array;

import java.util.Scanner;

public class Input_in_2D_Array {
    public static void main(String[] args) {
        int matrix[][]=new int [3][3];
//        int n=3,m=3;
        int n= matrix.length,m=matrix[0].length;
        System.out.print("Enter the element of 1st matrix : \n");
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
//        2nd Matrix
        int matrix2[][]=new int[3][3];
        int p= matrix2.length,q=matrix[0].length;
        System.out.print("Enter the element of 2nd matrix : \n");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                matrix2[i][j]=sc.nextInt();
            }
        }
        // Blank Matrix
        int matrix3[][]=new int[3][3];

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                matrix3[i][j]=matrix[i][j]+matrix2[i][j];
            }
        }

        System.out.println("Matrix element are : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
