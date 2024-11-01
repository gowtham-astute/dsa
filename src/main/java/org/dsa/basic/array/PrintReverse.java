package org.dsa.basic.array;

import java.util.Arrays;

public class PrintReverse {

    public static void reverse(int arr[]){
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] reverseArray(int arr[]){
        for (int i=0, j=arr.length-1;i<=j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10,5,20,33,44,54,65};
        PrintReverse.reverse(arr);

        int arr1[] = {10,5,20,33,44,54,65,45};
        System.out.println(Arrays.toString(PrintReverse.reverseArray(arr1)));
    }
}
