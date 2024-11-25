package org.dsa.string;

import java.util.HashMap;

/**
 * Given a string S of length n, the task is to find the earliest repeated character in it. The earliest repeated character means, the character that occurs more than once and whose second occurrence has the smallest index.
 *
 * Example:
 *
 * Input: s = “geeksforgeeks”
 * Output: e
 * Explanation: e is the first element that repeats
 */
public class EarliestRepeatingCharacter {
    public static String firstRepChar(String s)
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }else {
                Integer value = hm.get(s.charAt(i));
                if(value==1){
                    return  String.valueOf(s.charAt(i));
                }
            }
        }
        return new String("");
    }

    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(EarliestRepeatingCharacter.firstRepChar(str));
    }
}
