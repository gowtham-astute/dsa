package org.dsa.basic.array;

//Given a square matrix print its:
// 1. Main diagonal  2. secondary diagonal 3. interchange diagonals
public class SquareMatrix {

    //Print Main diagonal
    public static void printMainDiagonal(int arr[][]){
        for (int i=0, j=0; i<arr.length; i++,j++){
                    System.out.print(arr[i][j]+ " ");
        }
    }

    //Print Main diagonal
    public static void printMainDiagonal1(int arr[][]){
        for (int i=0; i<arr.length; i++){
                    System.out.print(arr[i][i]+ " ");
                }
    }

    //Print Secondary diagonal
    public static void printSecondaryDiagonal(int arr[][]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i][arr.length-1-i]+ " ");
        }
    }

    //Print Secondary diagonal
    public static void printSecondaryDiagonal1(int arr[][]){
        for (int i=0, j= arr.length-1; i<arr.length; i++,j--){
            System.out.print(arr[i][j] + " ");
        }
    }

    //Given a square matrix interchange its diagonals
    public static void interchangeDiagonals(int arr[][]) {
        for (int i = 0, j = arr.length-1;i< arr.length; i++,j-- ){
            int temp = arr[i][i];
            arr[i][i] = arr[i][j];
            arr[i][j] = temp;
        }
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] =
                {{10,5,20,12},
                {33,44,54,76},
                {65,34,35,58},
                {87,23,56,47}};

        SquareMatrix.printMainDiagonal(arr);
        System.out.println();
        SquareMatrix.printMainDiagonal1(arr);
        System.out.println();
        SquareMatrix.printSecondaryDiagonal(arr);
        System.out.println();
        SquareMatrix.printSecondaryDiagonal1(arr);
        System.out.println();
        System.out.println("----------");
        SquareMatrix.interchangeDiagonals(arr);
    }

}
