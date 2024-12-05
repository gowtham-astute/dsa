package org.dsa.string;

public class FindLastWord {

    public static int lengthOfLastWord(final String str) {
        int len = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                len = 0;
            } else {
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("which in this case is just a single match"));
    }
}
