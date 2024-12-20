package org.dsa.basic;

public class PrimeNumber {
    public static void findPrime(int n){
        int count=0;
        for (int i=1;i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if (count==2)
            System.out.println("prime number");
        else
            System.out.println("Not a prime number");
    }

    public static void printAllPrime(int n){
        for (int i=2;i<=n; i++){
            boolean isprime = true;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime)
                System.out.println("Prime number found: "+i);
        }
    }

    public static void main(String[] args) {
        PrimeNumber.findPrime(5);
        PrimeNumber.findPrime(21);
        PrimeNumber.findPrime(15);
        PrimeNumber.findPrime(1);

        PrimeNumber.printAllPrime(5);
        PrimeNumber.printAllPrime(25);
        PrimeNumber.printAllPrime(45);
        PrimeNumber.printAllPrime(1);
    }
}
