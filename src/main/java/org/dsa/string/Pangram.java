package org.dsa.string;

/**
 * Given a string s, the task is to check if it is Pangram or not.
 * A pangram is a sentence containing all letters of the English Alphabet.
 *
 * Examples:
 *
 * Input: s = “The quick brown fox jumps over the lazy dog”
 * Output: true
 * Explanation: The input string contains all characters from ‘a’ to ‘z’.
 *
 *
 * Input: s = “The quick brown fox jumps over the dog”
 * Output: false
 * Explanation: The input string does not contain all characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’
 * are missing
 */
public class Pangram {

    public static boolean checkPangram(String str){
        boolean result=false;
        for (char c='a'; c <='z'; c++){
            for (int i=0; i<str.length(); i++){
                if(c==str.toLowerCase().charAt(i)){
                    result = true;
                    break;
                }
            }
            if(!result)
                return false;
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the dog";
        System.out.println(Pangram.checkPangram(str));

        String str1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(Pangram.checkPangram(str1));
    }
}
