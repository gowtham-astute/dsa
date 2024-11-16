package org.dsa.basic.array;

public class InversionCount {

    static int inversionCount(int arr[]) {
        int inversionCount=0;
        for (int i=0;i<arr.length;i++){
            int count=0;
            for (int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            inversionCount+=count;
        }
        return inversionCount;
    }
    

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(InversionCount.inversionCount(arr));
    }
}
