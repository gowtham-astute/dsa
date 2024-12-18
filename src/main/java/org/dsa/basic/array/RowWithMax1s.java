package org.dsa.basic.array;

/**
 * You are given a 2D array consisting of only 1's and 0's, where each row is sorted in non-decreasing order.
 * You need to find and return the index of the first row that has the most number of 1s.
 * If no such row exists, return -1.
 * Note: 0-based indexing is followed.
 * <p>
 * Examples:
 * <p>
 * Input: arr[][] = [[0, 1, 1, 1],
 * [0, 0, 1, 1],
 * [1, 1, 1, 1],
 * [0, 0, 0, 0]]
 * Output: 2
 * Explanation: Row 2 contains 4 1's.
 */
public class RowWithMax1s {

    public static int rowWithMax1s(int arr[][]) {
        int max1srow = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= 1) {
                    count++;
                }
            }
            if (count > 0) {
                max1srow = i;
            }
        }
        return max1srow;
    }

    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.println(RowWithMax1s.rowWithMax1s(arr));
    }
}
