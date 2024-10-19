package org.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int arr[]){

        for(int i=0; i<arr.length; i++){
            int minIndex=i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex] ){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {100,80,30,12,45,22,90,67,12,87,99,102};
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
