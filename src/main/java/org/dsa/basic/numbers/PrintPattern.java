package org.dsa.basic.numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Print a sequence of numbers starting with n, without using a loop. Replace n with n - 5, n−5...
 * until n≤0. Then, replace n with n+5, n + 5, n+5 until n regains its initial value.
 * Complete the function pattern(n) which takes n as input and returns a list containing the pattern.
 */
public class PrintPattern {

    public List<Integer> pattern(int N){
        List<Integer> al = new ArrayList<>();
        int original=N;

        al = negativePattern(N, al);
        int current = al.get(al.size() - 1);
        al = positivePattern(current,  original, al);

        return al;
    }

    private List<Integer> negativePattern(int N, List<Integer> al){
        al.add(N);
        if(N<=0){
            return al;
        }
        return negativePattern(N-5, al);
    }

    private List<Integer> positivePattern(int N, int original, List<Integer> al){
        if(N>=original){
            return al;
        }
        al.add(N+5);
        return positivePattern(N+5,original, al);
    }

    public static void main(String[] args) {
        PrintPattern pp = new PrintPattern();
        System.out.println(pp.pattern(15));
    }
}
