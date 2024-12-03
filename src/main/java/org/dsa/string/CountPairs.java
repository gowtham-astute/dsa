package org.dsa.string;

public class CountPairs {
    public static int countPairs(String str){
        int count=0;
        for (int i=0; i<str.length(); i++){
            for (int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(countPairs(s));
    }
}
