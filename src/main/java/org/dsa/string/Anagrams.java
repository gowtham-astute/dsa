package org.dsa.string;

import java.util.HashMap;

public class Anagrams {

    public static boolean areAnagrams(String s1, String s2) {

        HashMap<String,Integer> hm = new HashMap<>();

        if(!hm.containsKey(s1)){
            hm.put(s1,1);
        }else {
            hm.put(s1,hm.get(s1)+1);
        }

        if(!hm.containsKey(s2)){
            hm.put(s1,1);
        }else {
            hm.put(s1,hm.get(s1)-1);
        }

        for(var pair: hm.entrySet()){
            if(pair.getValue()!=0)
                return false;
        }

        return true;
    }
}
