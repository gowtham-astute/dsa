package org.dsa.basic.array;

//traverse the array in spiral order and print the elements
public class SpiralOrder {

    public static void main(String[] args) {
        int arr[][] =
                {{1,2,3,4,5,6},
                {18,19,20,21,22,7},
                {17,28,29,30,23,8},
                {16,27,26,25,24,9},
                {15,14,13,12,11,10}};

        int top=0, bottom=arr.length-1, left=0, right=arr[0][arr.length-1];
        while(top<=bottom && left<=right) {
            for (int col = left; col < right; col++) {
                System.out.print(arr[top][col] + " ");
            }
            for (int row = top; row < bottom; row++) {
                System.out.print(arr[row][right] + " ");
            }
            for (int col = right; col > left; col--) {
                System.out.print(arr[bottom][col] + " ");
            }
            for (int row = bottom; row > top; row--) {
                System.out.print(arr[row][left] + " ");
            }
            top++;left++;bottom--;right--;
        }
    }
}
