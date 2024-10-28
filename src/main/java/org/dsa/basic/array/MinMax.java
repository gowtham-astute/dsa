package org.dsa.basic.array;

/**
 * Given an array arr. Your task is to find the minimum and maximum elements in the array.
 *
 * Note: Return an array that contains two elements the first one will be a minimum element and the
 * second will be a maximum of an array.
 * Examples:
 *
 * Input: arr = [3, 2, 1, 56, 10000, 167]
 * Output: 1 10000
 * Explanation: minimum and maximum elements of array are 1 and 10000.
 */
public class MinMax {
    public static void getMinMax(int[] arr) {
        int min=arr[0];
        int max=arr[arr.length-1];
        for (int i=0,j=arr.length-1;i<arr.length;i++,j--){
            if(arr[i]<min){
                min=arr[i];
            }
            if ((arr[j])>max){
                max=arr[j];
            }
        }
        System.out.println("Min value is "+min +" and Max value is "+max);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 56, 10000, 167};
        int arr2[] = {56789};
        MinMax.getMinMax(arr);
        MinMax.getMinMax(arr2);
    }
}
