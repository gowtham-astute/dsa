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

    //Given a value of N, print only those numbers from 1 to N that have sum of digits = K
    public static void sum(int n, int k){
        for(int i=1;i<=n;i++){
            int sum=0;
            for (int j=i;j>0;j/=10){
                int lastDigit=j%10;
                sum+=lastDigit;
            }
            if(sum==k){
                System.out.println("Result is "+i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigits.sum(163425));
        System.out.println(SumOfDigits.sum(12345));

        SumOfDigits.sum(12,3);
        SumOfDigits.sum(123, 12);
    }
}
