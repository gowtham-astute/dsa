package org.dsa.string;

/**
 * Given string str, the task is to check whether the given string is linear or not.
 * If it is linear then print “Yes” else print “No”.
 * Examples:
 *
 * Input: str = “aapaxyayziabcde”
 * Output: Yes
 * Explanation:
 * a
 * ap
 * axy
 * ayzi
 * abcde
 * All the broken string have same character as the first character.
 * Input: str = “bbobfycd”
 * Output: No
 * Explanation:
 * b
 * bo
 * bfy
 * cd
 * Here b=b=b!=c
 */
public class CheckIfLinear {

    public static boolean is_linear(String s)
    {
        boolean result =false;
       char c = s.charAt(0);
       int temp=0;
       for (int i=0; i<s.length(); i+=temp){
           if(s.charAt(i)==c){
               result =true;
           }
           else{
               return false;
           }
           temp++;
       }
        return result;
    }

    public static void main(String[] args) {
        String str ="aapaxyayziabcde";
        System.out.println(is_linear(str));
        System.out.println(is_linear("bbobfycd"));
    }
}
