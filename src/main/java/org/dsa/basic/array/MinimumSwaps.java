package org.dsa.basic.array;
//Minimum Swaps to Sort

/**
 * Given an array arr[] of distinct elements.
 * Find the minimum number of swaps required to sort the array in strictly increasing order.
 * Input: arr[] = [10, 19, 6, 3, 5]
 * Output: 2
 * Explanation: swap 10 with 3 and swap 19 with 5.
 */
public class MinimumSwaps {

    public static int minSwaps(int arr[]) {
        int count=0;
        for (int i=0; i<arr.length; i++){
            int minIndex=i; int maxIndex=i;
            for (int j=i; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            if(minIndex>maxIndex){
                count++;
                int temp=arr[minIndex];
                arr[minIndex]=arr[maxIndex];
                arr[maxIndex]=temp;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int  arr[] = {10, 19, 6, 3, 5};
        int arr1[] = {2, 8, 5, 4};
        int arr2[] = {32524, 30965, 30657, 18612, 29956, 15628, 16059, 10826, 23546, 22340};
        System.out.println(MinimumSwaps.minSwaps(arr2));
    }

}
