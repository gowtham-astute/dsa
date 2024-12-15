package org.dsa.basic.array;

/**
 * Program to find the maximum element in a Matrix
 * Input: mat[4][4] = {{1, 2, 3, 4},
 * {25, 6, 7, 8},
 * {9, 10, 11, 12},
 * {13, 14, 15, 16}};
 */
public class MaxElementInAMatrix {

    public static void findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max element is " + max);
    }

    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 4},
                {25, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 55, 16}};

        MaxElementInAMatrix.findMax(mat);
    }
}
