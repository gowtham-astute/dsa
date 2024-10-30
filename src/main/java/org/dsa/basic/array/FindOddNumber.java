package org.dsa.basic.array;

public class FindOddNumber {

    public static void find(int num){
        if(num%2!=0){
            System.out.println("Number "+num + " is Odd number");
        }
        else{
            System.out.println("Number "+num + " is not Odd number");
        }
    }
    public static void main(String[] args) {
        FindOddNumber.find(100);
        FindOddNumber.find(13);
        
    }
}
