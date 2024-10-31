package org.dsa.basic.array;

import java.util.Arrays;

//Find smallest and second smallest element in an array(assume that atleast two distinct elements will be available)
public class FindSmallest {

    public static void find(int arr[]){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }
        }
        if(smallest==Integer.MAX_VALUE)
            System.out.println("Smallest element is "+-1);
        else
            System.out.println("Smallest element is "+smallest);
        if (secondSmallest==Integer.MAX_VALUE)
            System.out.println("Second Smallest element is "+-1);
        else
            System.out.println("Second Smallest element is "+secondSmallest);
    }

    public static int[] minAnd2ndMin(int arr[]) {
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            } else if (arr[i]<secondSmallest && arr[i]!=smallest) {
                secondSmallest=arr[i];
            }
        }
        if(smallest==Integer.MAX_VALUE || secondSmallest==Integer.MAX_VALUE)
            return new int[] {-1,-1};
        else
            return new int[] {smallest,secondSmallest};
    }

    public static void main(String[] args) {
        int arr[] = {10,5,20,33,44,54,65};
        FindSmallest.find(arr);

        int arr1[] = {};
        FindSmallest.find(arr1);

        int arr2[] = {5,15,14,5,16,17,5,17,3,8,17,4,9};
        System.out.println(Arrays.toString(FindSmallest.minAnd2ndMin(arr2)));

        int arr3[] = {1,1,1,1};
        System.out.println(Arrays.toString(FindSmallest.minAnd2ndMin(arr3)));
    }
}
