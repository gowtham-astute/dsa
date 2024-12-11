package org.dsa.basic.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array arr. Find the majority element in the array. If no majority exists, return -1.
 * A majority element in an array is an element that appears strictly more than arr.size() / 2 times in
 * the array.
 * <p>
 * Examples :
 * Input : arr[] = {1, 1, 2, 1, 3, 5, 1}
 * Output : 1
 * Explanation: Note that 1 appear 4 times which is more than  7 / 2 times
 */
public class MajorityElement {

    public static int findMajority(int arr[]) {

        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                Integer value = hm.get(arr[i]);
                hm.put(arr[i], value + 1);
            }
        }

        int max = arr.length / 2;
        for (Integer key : hm.keySet()) {
            if (hm.get(key) > max) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 3, 5, 1};
        int arr1[] = {3, 3, 4, 2, 4, 4, 2, 4};
        int arr2[] = {3};

        System.out.println(MajorityElement.findMajority(arr));
        System.out.println(MajorityElement.findMajority(arr1));
        System.out.println(MajorityElement.findMajority(arr2));
    }
}
