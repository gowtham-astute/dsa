package org.dsa.basic;

import java.util.Scanner;

/**
 * Given a positive number find the number of digits in that number
 */
public class CountNoOfDigits {

    public static int countDigits(int num){
        if(num > 0){
            int count=0;
            while(num > 0){
                num = num/10;
                count++;
            }
            return count;
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(countDigits(x));
            System.out.println(countDigits(y));
            System.out.println(countDigits(z));
        }

    }
}
