package org.dsa.string;

public class ReverseNumber {
    public static void reverse(Long num){
        StringBuilder str= new StringBuilder(String.valueOf(num));
        System.out.println("Reverse of "+num + " is "+str.reverse());
    }

    

    public static void main(String[] args) {
        ReverseNumber.reverse(123456L);
        ReverseNumber.reverse(47358767978769L);
    }
}
