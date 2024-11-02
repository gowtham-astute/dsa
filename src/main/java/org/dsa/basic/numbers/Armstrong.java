package org.dsa.basic.numbers;

public class Armstrong {
    public static void armStrongNumber(int n){
        int a = 0;
        int result = 0;
        int target=n;
        while(n>0) {
            a = n % 10;
            n = n / 10;
            result += (a * a * a);
        }
        if(target==result){
            System.out.println("Its Armstrong Number");
        }
        else
            System.out.println("Not a Armstrong number");
    }

    public static void main(String[] args) {
        Armstrong.armStrongNumber(153);
        Armstrong.armStrongNumber(100);
    }
}
