package org.dsa.basic.numbers;

//Given a number n. Find if the digit sum(or sum of digits) of n is a Palindrome number or not.
public class SumOfDigitIsPallindrome {

    public static int isDigitSumPalindrome(int n) {
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum+=lastdigit;
            n=n/10;
        }

        int originalsum=sum;
        int reversed=0;
        while(sum>0){
            int lastdigit=sum%10;
            reversed = reversed*10+lastdigit;
            sum=sum/10;
        }

        if (originalsum==reversed){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigitIsPallindrome.isDigitSumPalindrome(56));
    }
}

