package org.dsa.basic.array;

import java.util.*;

/**
 * Given three sorted arrays in non-decreasing order, print all common elements in these arrays.
 *
 * Note: In case of duplicate common elements, print only once.
 */
public class FindCommonElement {

    public static void find(int a[], int b[], int c[]){

        ArrayList<Integer> al =new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        for (int i=0;i<a.length;i++){
            map.put(a[i],1);
        }

        for (int i=0;i<b.length;i++){
            if(map.containsKey(b[i]))
                 map.put(b[i],2);
        }

        for (int i=0;i<c.length;i++){
            if(map.containsKey(c[i]))
                map.put(c[i],3);
        }

        for (int ele : map.keySet()){
            if(map.get(ele)==3)
                al.add(ele);
        }

        System.out.println(Arrays.toString(al.toArray()));

    }

    public static void main(String[] args) {
        int A[]={1, 5, 10, 20, 30};
        int B[]={5, 13, 15, 20};
        int C[]={5, 20};

        find(A,B,C);
    }


}
