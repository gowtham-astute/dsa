package org.dsa.basic;

public class GCD {

    public static void findGCD(int a, int b){
       int min= Math.min(a,b);
       int gcd=-1;
       for (int i=min;i>0;i--){
           if(a%i==0 && b%i==0) {
               gcd = i;
               break;
           }
       }
       if (gcd!=-1)
           System.out.println("GCD is "+gcd);
       else
           System.out.println("No GCD found");
    }

    public static void main(String[] args) {
        findGCD(18,36);
        findGCD(5,6);
    }
}
