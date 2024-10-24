package org.dsa.basic;

/**
 * Fizz Buzz Problem involves that given an integer n, for every integer i <= n, the task is to print,
 * 'FizzBuzz' if i is divisible by 3 and 5, 'Fizz' if i is divisible by 3, 'Buzz' if i is divisible by 5,
 * otherwise print the value of it.
 */
public class FizzBuzz {
    public static void print(int n) {
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0){
                System.out.println("Fizz");
            }else if (i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz.print(10);
        System.out.println("-----------------");
        FizzBuzz.print(25);
    }
}
