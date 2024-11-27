package org.dsa.string;

public class Length_of_a_String {
    public static <Char> int length(String str){
        int count=0;
        for (Character c: str.toCharArray()){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "gfgsdsjhvshvdshh";
        System.out.println(Length_of_a_String.length(str));
    }
}
