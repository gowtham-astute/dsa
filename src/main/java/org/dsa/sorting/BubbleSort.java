package org.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {100,80,30,12,45,22,90,67,87,99,102};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
