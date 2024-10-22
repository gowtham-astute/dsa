package org.dsa.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a string str, the task is to reverse the order of the words in the given string.
 * Note that str may contain leading or trailing dots(.) or multiple trailing dots(.) between two words.
 * The returned string should only have a single dot(.) separating the words.
 *
 * Examples:
 * Input: str = “i.like.this.program.very.much”
 * Output: str = “much.very.program.this.like.i”
 *
 * Input: str = ”..geeks..for.geeks.”
 * Output: str = “geeks.for.geeks”
 */
public class ReverseWord {

public static String reverseWords(String str){
    ArrayList<String> words = new ArrayList<>();
   String[] parts = str.split("\\.");

   for (String word: parts){
        if(!word.isEmpty())
            words.add(word);
   }
    Collections.reverse(words);

   return String.join(".", words);

}

    public static void main(String[] args) {
        String str = "..geeks..for.geeks.";
        System.out.println(reverseWords(str));
    }
}
