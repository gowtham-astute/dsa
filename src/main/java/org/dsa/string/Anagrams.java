package org.dsa.string;

import java.util.HashMap;

public class Anagrams {

    public static boolean areAnagrams(String s1, String s2) {

        HashMap<Character,Integer> hm = new HashMap<>();

        for (char ch : s1.toLowerCase().toCharArray()){
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else {
                hm.put(ch,hm.get(ch)+1);
            }
        }

        for (char ch : s2.toLowerCase().toCharArray()){
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else {
                hm.put(ch,hm.get(ch)-1);
            }
        }

        for(var pair: hm.entrySet()){
            if(pair.getValue()!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Anagrams.areAnagrams("geeks","kseeg"));

    }
}
