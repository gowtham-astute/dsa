package org.dsa.basic;

//Given a number check if its a power of 2
public class PowerOf2 {
    public static void verifyPowerOf2(int num){
        int temp=num;
        while(num>=1){
            if(num%2==0){
                num=num/2;
            }
            else{
                break;
            }
        }
        if(num==1){
            System.out.println("The given number "+temp +" is a power of 2");
        }else{
            System.out.println("The given number " +temp +" is not a power of 2");
        }
    }

    public static void verify(int num){
        int temp=num;
        if(num>0) {
            while (num % 2 == 0) {
                num /= 2;
            }
        }
        if(num==1){
            System.out.println("The given number "+temp +" is a power of 2");
        }else{
            System.out.println("The given number " +temp +" is not a power of 2");
        }
    }
    public static void main(String[] args) {
        PowerOf2.verify(-8);
        PowerOf2.verifyPowerOf2(3);
        PowerOf2.verifyPowerOf2(5);
        PowerOf2.verifyPowerOf2(16);
        PowerOf2.verifyPowerOf2(18);
        PowerOf2.verifyPowerOf2(32);
    }
}
