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

        al = negativePattern(N,  al);
        al = positivePattern(N+5,  al);
    }

    private List<Integer> negativePattern(int N, List<Integer> al){
        al.add(N);
        if(N<=0){
            return al;
        }
        return negativePattern(N-5,al);
    }

    private List<Integer> positivePattern(int N, List<Integer> al){
        al.add(N);
        if(N==0){
            return al;
        }
    }
}
