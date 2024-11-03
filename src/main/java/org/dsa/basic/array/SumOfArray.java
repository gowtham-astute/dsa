package org.dsa.basic.array;
public class SumOfArray {
    public static int sum(int arr[]) {
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {5,15,14,5,16,17,5,17,3,8,17,4,9};
        System.out.println(SumOfArray.sum(arr));

        int arr1[] = {};
        System.out.println(SumOfArray.sum(arr1));

        int arr2[] = {1,5,10};
        System.out.println(SumOfArray.sum(arr2));
    }
}
