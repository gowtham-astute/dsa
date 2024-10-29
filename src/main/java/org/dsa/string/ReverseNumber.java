package org.dsa.string;

public class ReverseNumber {
    public static void reverse(Long num){
        StringBuilder str= new StringBuilder(String.valueOf(num));
        System.out.println("Reverse of "+num + " is "+str.reverse());
    }

    public static void reverse(int num){
        int temp=num;
        int rev = 0;
        while(num>0){
            rev = rev *10 + num%10;
            num/=10;
        }
        System.out.println("Reverse of "+temp + " is "+rev);
    }

    public static void main(String[] args) {
        ReverseNumber.reverse(123456L);
        ReverseNumber.reverse(47358767978769L);
        ReverseNumber.reverse(123456);
        ReverseNumber.reverse(473587679);
    }
}
