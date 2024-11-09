package org.dsa.basic.array;

/**
 * Given two integers N and M and a matrix of dimensions N*M. Count all the rows in a matrix that are
 * sorted either in strictly increasing order or in strictly decreasing order.
 *
 * Example 1:
 *
 * Input:
 * N=3,M=3
 * Mat=[[1,2,3],[6,5,4],[7,9,8]]
 * Output:
 * 2
 * Explanation:
 * The first row is sorted in strictly
 * increasing order while the second row
 * is sorted in strictly decreasing order.
 */
public class CountSortedRows {
    public static int sortedCount(int N, int M, int Mat[][]) {
        int finalCount=0;
        for (int i=0; i<N; i++){
            int count=0;
            for (int j=0; j<M-1; j++){
                    if (Mat[i][j] < Mat[i][j + 1]) {
                        count++;
                    }
                    else if (Mat[i][j] > Mat[i][j + 1]) {
                        count--;
                    }
            }
            if(Math.abs(count)==Mat[i].length-1){
                finalCount++;
            }
        }
        return finalCount;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{6,5,4},{7,9,8}};
        System.out.println(CountSortedRows.sortedCount(3,3,arr));
    }
}
