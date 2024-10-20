package org.dsa.basic;

public class FindEven {

    public static void findEven(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[0]%2==0){
                count++;
            }
        }
        if(count==arr.length){
            System.out.println("Even Number");
        }else{
            System.out.println("Not A Even Number");
        }

    }
}
