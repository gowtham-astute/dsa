package org.dsa.basic;

public class StarPattern {

    public static void squareStarPattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rhombusStarPattern(int n){
        for (int i=0;i<n;i++){
            for (int k=0;k<i;k++){
                System.out.print(" ");
            }
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rhombusStarPattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+n;j++){
                if(j<i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int n){
        int sp=n-1;
        for(int i=0;i<n;i++){
            sp--;
            for (int j=sp;j>0;j--){
                System.out.print(" ");
            }
            for (int k=0;k<(i*2)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n-1;i>0;i--){
            for (int j=0;j<i-3;j++){
                System.out.println(" ");
            }
            for (int k=0;k<(i*2)-1;k++){
                System.out.println("*");
            }
        }


    }

    public static void main(String[] args) {
        //StarPattern.squareStarPattern(5);
        //StarPattern.rhombusStarPattern(5);
       // StarPattern.rhombusStarPattern1(5);
        StarPattern.diamondPattern(5);
    }
}
