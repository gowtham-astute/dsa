package org.dsa.basic.array;

import java.util.Arrays;

/**
 * You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n
 * (inclusive). This array represents a permutation of the integers from 1 to n with one element missing.
 * Your task is to identify and return the missing element.
 */
public class MissingNumber {
    public static int missingNumber(int arr[]) {
        int sum=0;
        int n=arr.length+1;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int originalSum=n*(n+1)/2;
        return originalSum-sum;
    }

    //Find missing and repeated element
    public static void missingAndRepeated(int arr[]) {

        boolean visited[] = new boolean[arr.length+1];
        int repeated = -1; int missing = -1;
        Arrays.fill(visited,false);
        for(int i=0; i< arr.length; i++){
            if(visited[arr[i]]){
                repeated = arr[i];
            }
            else{
                visited[arr[i]] = true;
            }
        }
        for(int i=1;i<= arr.length;i++){
            if(!visited[i]){
                missing = i;
                break;
            }
        }
        System.out.println("Missing number is "+missing);
        System.out.println("Repeated number is "+repeated);
    }
    public static void main(String[] args) {
        int arr[] = {1, 1,2};
        System.out.println(MissingNumber.missingNumber(arr));
        MissingNumber.missingAndRepeated(arr);
    }
}
