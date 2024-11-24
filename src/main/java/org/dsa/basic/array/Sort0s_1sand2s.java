package org.dsa.basic.array;

import java.util.Arrays;

//Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
public class Sort0s_1sand2s {
    public static void sort012(int[] arr) {

        //bubble sort
//        for (int i=0; i< arr.length; i++){
//            for (int j=0; j<arr.length-i-1; j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }

        //Dutch National Flag Algorithm
        int low=0, mid=0, high= arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid, low);
                mid++;low++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));

        //Merge sort
        //System.out.println(Arrays.toString(merge(arr)));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int[] merge(int[] arr){

        if(arr.length==1)
            return arr;

        int mid = arr.length/2;

        int left[] = merge(Arrays.copyOfRange(arr, 0, mid));
        int right[] = merge(Arrays.copyOfRange(arr, mid, arr.length));

       return mergeSort(left, right);
    }

    private static int[] mergeSort(int[] left, int[] right) {

        int merge[] = new int[left.length + right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                merge[k++]=left[i++];
            } else if (right[j]<left[i]) {
                merge[k++]=right[j++];
            }
            else{
                merge[k++]=left[i++];
            }
        }
        if(i<left.length){
            while(i<left.length){
                merge[k++]=left[i++];
            }
        }
        if(j<right.length){
            while(j<right.length){
                merge[k++]=right[j++];
            }
        }

        return merge;
    }

    public static void main(String[] args) {
        //int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        //int arr[] = {4, 3, 2, 0, 1};
        int arr[] = {0, 1, 2, 0, 1, 2};
        Sort0s_1sand2s.sort012(arr);
    }
}
