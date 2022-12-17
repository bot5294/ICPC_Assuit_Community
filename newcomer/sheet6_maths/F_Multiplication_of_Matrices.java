// import java.util.*;
// public class F_Multiplication_of_Matrices{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int r1 = sc.nextInt();
//         int c1 = sc.nextInt();
//         int mat1[][] = new int[r1][c1];
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c1;j++){
//                 mat1[i][j] = sc.nextInt();
//             }
//         }
//         int r2 = sc.nextInt();
//         int c2 = sc.nextInt();
//         int mat2[][] = new int[r1][c1];
//         for(int i=0;i<r2;i++){
//             for(int j=0;j<c2;j++){
//                 mat2[i][j] = sc.nextInt();
//             }
//         }
//         int mat3[][] = new int[r1][c2];
 
//         for (int i = 0; i < r1; i++) {
//             for (int j = 0; j < c2; j++) {
//                 for (int k = 0; k < c1; k++)
//                     mat3[i][j] += mat1[i][k] * mat2[k][j];
//                 System.out.print(mat3[i][j] + " ");
//             }
//             System.out.println();
//         }
//         // for (int i = 0; i < r1; i++) {
//         //     for (int j = 0; j < c2; j++) {
              
//         //     }
//         //     System.out.println();
//         //  }
//         sc.close();
//     }
// }


import java.util.Scanner;

public class F_Multiplication_of_Matrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int m1[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int m2[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        
        int arr[][]=new int[r][c1];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c1; j++) { 
                for (int k = 0; k < c; k++) {
                     arr[i][j]+=m1[i][k]*m2[k][j]; 
                }
                 System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
      sc.close();     
    }
}
