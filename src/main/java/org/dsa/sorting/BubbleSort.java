package org.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swapped =true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {100,80,30,12,45,22,90,67,12,87,99,102};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
