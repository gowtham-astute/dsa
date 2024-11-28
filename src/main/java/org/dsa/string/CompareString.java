package org.dsa.string;

//Check if two strings are same or not
public class CompareString {

    public static void compare(String str1, String str2){
        if(str1.length()!=str2.length()){
            System.out.println("Not equal");
        }else {
            boolean result = true;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    result = false;
                    break;
                }
            }
            if(result)
                System.out.println("Strings are equal");
            else
                System.out.println("Not equal");
        }
    }

    public static void main(String[] args) {
        CompareString.compare("","");
        CompareString.compare("ef","EF");
        CompareString.compare("dsdl","dsksd");
        CompareString.compare("abcde","abcde");
    }
}
