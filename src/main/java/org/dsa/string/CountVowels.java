package org.dsa.string;

public class CountVowels {
    public static boolean isVowel(Character ch){
        return ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u';
    }

    public static int vowelCount(String str){
            int count=0;
        for (int i=0;i<str.length(); i++){
            if(isVowel(str.toLowerCase().charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abc de";
        String str1 = "abcadnir didmclkme";

       System.out.println(CountVowels.vowelCount(str));
        System.out.println(CountVowels.vowelCount(str1));
    }
}
