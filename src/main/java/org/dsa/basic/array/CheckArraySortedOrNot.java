package org.dsa.basic.array;

/**
 * Given an array arr[], check whether it is sorted in non-decreasing order.
 * Return true if it is sorted otherwise false.
 */
public class CheckArraySortedOrNot {

    public static boolean arraySortedOrNot(int[] arr) {
        for (int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {10,5,20,33,44,54,65};
        System.out.println(CheckArraySortedOrNot.arraySortedOrNot(arr));

        int arr1[] = {1,1,1};
        System.out.println(CheckArraySortedOrNot.arraySortedOrNot(arr1));
    }
}
