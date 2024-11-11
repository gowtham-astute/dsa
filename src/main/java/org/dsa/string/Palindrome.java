package org.dsa.string;

//Palindrome String
public class Palindrome {

    public static boolean isPalindrome(String s){
        StringBuilder rev = new StringBuilder("");
        for (int i=s.length()-1;i>=0;i--){
            rev.append(String.valueOf(s.charAt(i)));
        }
        if(s.equals(rev.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "abba";
        System.out.println(Palindrome.isPalindrome(input));
    }
}
