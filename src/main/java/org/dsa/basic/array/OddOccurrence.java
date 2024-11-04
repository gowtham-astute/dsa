package org.dsa.basic.array;

import java.util.HashMap;

/**
 * Find the Number Occurring Odd Number of Times
 * Examples :
 * Input : arr = {1, 2, 3, 2, 3, 1, 3}
 * Output : 3
 *
 * Input : arr = {5, 7, 2, 7, 5, 2, 5}
 * Output : 5
 */
public class OddOccurrence {

    public static int getOddOccurrence(int arr[]){

        HashMap<Integer,Integer> hm = new HashMap<>();

      for(int val : arr){
          if (hm.containsKey(val)){
              int value = hm.get(val);
              hm.put(val,value+1);
          }
          else {
              hm.put(val,1);
          }
      }

        for(Integer a:hm.keySet())
        {
            if(hm.get(a) % 2 != 0)
                return a;
        }

      return -1;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 3, 1, 3};
        System.out.println(OddOccurrence.getOddOccurrence(arr));
    }
}
