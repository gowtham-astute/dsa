package org.dsa.basic.array;

/**
 * Given a sorted array, arr and a number target, you need to find the number of occurrences of target in arr.
 *
 * Examples :
 *
 * Input:  arr = [1, 1, 2, 2, 2, 2, 3], target = 2
 * Output: 4
 * Explanation: target = 2 occurs 4 times in the given array so the output is 4.
 */
public class NumberOfOccurance {
    public static int count(int[] arr, int k) {
        int mid = arr.length/2;
        int count=0;
        for(int i=0, j=arr.length-1; i<=mid; i++,j--){
            if(arr[i]==k){
                count++;
            }
            if (arr[j]==k && j>mid){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(NumberOfOccurance.count(arr,2));
    }

}
