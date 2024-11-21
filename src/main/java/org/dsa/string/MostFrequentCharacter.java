package org.dsa.string;

public class MostFrequentCharacter {
    public static char getMaxOccuringChar(String line)
    {
        int freq[] = new int[256];
        for (int i =0; i<line.length(); i++){
            int c = (int)line.charAt(i);
            freq[c]++;
        }

        char maxChar = 0;
        int maxFreq=0;
        for (int i=0; i<256; i++){
            int value = freq[i];
            if(value>=maxFreq){
                if(value==maxFreq){
                    int i1 = value < maxFreq ? value : maxFreq;
                    maxChar= (char)i1;
                    continue;
                }
               maxChar= (char)i;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        String str ="testsample";
        System.out.println(MostFrequentCharacter.getMaxOccuringChar(str));
    }
}
