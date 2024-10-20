package org.dsa.basic;

public class FindEven {

    public static void validate(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        if(count==arr.length){
            System.out.println("Even Number");
        }else{
            System.out.println("Not A Even Number");
        }

    }

    public static void main(String[] args) {
        int arr[] = {10,13,11,10,9,17,21};
        int arr2[] = {2,4,6,8,10};
        FindEven.validate(arr);
        FindEven.validate(arr2);
    }
}
