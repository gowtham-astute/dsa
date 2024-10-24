package org.dsa.basic;

public class SumOfDigits {
    public static int sum(int digit){
        int sum =0;
        while(digit > 0){
            int temp = digit%10;
            sum = sum+temp;
            digit = digit/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigits.sum(163425));
        System.out.println(SumOfDigits.sum(12345));
    }
}
