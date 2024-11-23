package org.dsa.basic.array;

import java.util.Arrays;

//Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
public class Sort0s_1sand2s {
    public static void sort012(int[] arr) {

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        Sort0s_1sand2s.sort012(arr);
    }
}
