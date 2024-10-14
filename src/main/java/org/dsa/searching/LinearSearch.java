package org.dsa.searching;

public class LinearSearch {

    public static int find(String input, Character target){
        for(int i =0; i<input.length(); i++){
            if(input.charAt(i)==target)
                return i;
        }
        return -1;
    }

    public static boolean contains(int arr[], int target){
        for(int ele: arr){
            if(ele == target){
                return true;
            }
        }
        return false;
    }

    public static int find(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,13,11,10,9,17,21};
        String name ="Gowtham";
        System.out.println();
        System.out.println(LinearSearch.find(arr,17));
        System.out.println(LinearSearch.find(name,'G'));
        System.out.println(LinearSearch.contains(arr,18));
        System.out.println(LinearSearch.find(name,'h'));
    }

    
}
