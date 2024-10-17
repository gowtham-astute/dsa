package org.dsa.searching;

/** Order agnostic Binary search
 *  Returns the index of target element
 *  Returns -1 if target not found
 */
public class BinarySearch {
    public static int search(int arr[], int target){

        boolean asc =true;
        int start=0;
        int end = arr.length-1;
        if(arr[start] > arr[end]){
            asc = false;
        }

        if(asc) {
            while (end >= start) {
                int mid = (start + end) / 2;
                if (target < arr[mid]) { //focus on left side
                    end = mid - 1;
                } else if (target > arr[mid]) { //focus on right side
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }else{
            while( end >= start){
                int mid = (start + end)/2;
                if(target < arr[mid]){//focus on right side
                    start = mid +1;
                } else if (target > arr[mid]) {//focus on left side
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,17,23,46,55,89,90,101};
        int des[] = {123,112,101,90,88,77,65,54,43,36,23,11};

        System.out.println("Index value of 10 is " +BinarySearch.search(arr, 10));
        System.out.println("Index value of 90 is " +BinarySearch.search(arr, 90));

        System.out.println("Index value of 77 is " +BinarySearch.search(des, 77));
        System.out.println("Index value of 15 is " +BinarySearch.search(des, 15));
    }

}
