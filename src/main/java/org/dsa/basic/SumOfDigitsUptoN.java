package org.dsa.basic;

import java.util.Scanner;
//Display sum of digits from 1 upto N
public class SumOfDigitsUptoN {
    public static int sum(int num){
        int sum=0;
        while(num > 0){
            int lastdigit = num%10;
            sum +=lastdigit;
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
            System.out.println(SumOfDigitsUptoN.sum(i));
        }
    }
}
