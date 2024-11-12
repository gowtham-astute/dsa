package org.dsa.basic.array;

import java.util.Arrays;

/**
 * Basic matrix multiplication rule is first matrix column size should match with second matrix row size
 * ex: 2*3 and 3*4
 */

public class MatrixMultiplication {

    public static void multiply(int a1[][], int b1[][]){

        int ans[][] = new int[a1.length][b1.length];
        for (int i=0;i<a1.length; i++){
            for (int j=0; j<b1[i].length; j++){
                int curr=0;
                for (int k=0; k<a1[i].length; k++){
                    curr += a1[i][k] * b1[k][i];
                }
                ans[i][j] = curr;
            }
        }

        for (int i=0;i<ans.length;i++){
            for (int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] =
                {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int arr1[][] =
                {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int arr2[][] ={{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};

        int arr4[][] ={{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};

        MatrixMultiplication.multiply(arr2,arr4);
    }
}
