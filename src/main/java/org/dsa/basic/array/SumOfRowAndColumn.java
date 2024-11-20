package org.dsa.basic.array;

/**
 * Given a matrix A of dimensions NxM. Check whether the sum of the ith row is equal to the sum of the
 * ith column.
 * Note: Check only up to valid row and column numbers i.e if the dimensions are 3x5, check only for
 * the first 3 rows and columns, i.e. min(N, M).
 *
 * Example 1:
 *
 * Input:
 * N=2,M=2
 * A=[[1,2],[2,1]]
 * Output:
 * 1
 * Explanation:
 * The sum of 1st row is equal to sum of
 * 1st column and also sum of 2nd row is equal
 * to the sum of 2nd column.So, Answer is 1.
 */
public class SumOfRowAndColumn {
    public static int sumOfRowCol(int N, int M, int A[][]) {
        int min = N<M?N:M;

        for (int i=0; i<min; i++){
            int rOwValue = findROwValue(i, A);
            int columnValue = findColumnValue(i, A);
            if(rOwValue!=columnValue)
                return 0;
        }
        return 1;
    }

    private static int findROwValue(int row, int A[][]){
        int sum=0;
        for (int i=row;i<=row;i++){
            for (int j=0;j<A[i].length;j++){
                sum+=A[i][j];
            }
        }
        return sum;
    }

    private static int findColumnValue(int column, int A[][]){
        int sum=0;
        for (int i=column;i<=column;i++){
            for (int j = 0; j< A.length; j++){
                sum+=A[j][i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        int A[][]={{1,2},{2,1}};
//        System.out.println(SumOfRowAndColumn.sumOfRowCol(2,2,A));

        int A[][]={{1},{2},{3},{4}};
        System.out.println(SumOfRowAndColumn.sumOfRowCol(4,1,A));
    }
}
