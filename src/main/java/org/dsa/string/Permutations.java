package org.dsa.string;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<String> findPermutation(String s) {
        List<String> l = new ArrayList<>();
        for (int i=0; i<s.length(); i++){
            //String temp= new String(s);
            for (int j=0; j<s.length()-1; j++){
                if(i==0 && j==0){
                    l.add(s);
                    continue;
                }
                if(i!=j) {
                    char[] c = s.toCharArray();
                    char[] temp = new char[c.length];
                    temp[0] = c[i];
                    char swap = c[j];
                    char swap1 = c[j + 1];
                    temp[j] = swap1;
                    temp[j + 1] = swap;
                    String swappedString = new String(temp);
                    l.add(swappedString);
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(Permutations.findPermutation(str));
    }
}
