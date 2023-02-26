package com.company;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int [] nums = {2,1,2,2,1,3,3};
        int n = nums.length;
        System.out.println(getMajorityElement(nums,n));
    }

    /*
    * Time Complexity = O(n)
    * Space Complexity = O(n)
    * */
    public static int getMajorityElement(int[] arr, int n)
    {
        int maxFreq = 0;
        int mostFreq = 0;
        HashMap <Integer, Integer> hash = new HashMap<>();
        for (int i = 0 ; i < n ; i++ ) {
            if (hash.containsKey(arr[i]))
            {
                int freq = hash.get(arr[i]);
                freq++;
                hash.put(arr[i],freq);
                /*If we have two or more elements in the array with equal frequency, This will return the
                first element to reach maximum frequency*/
                if (maxFreq < freq)
                {
                    maxFreq = freq;
                    mostFreq = arr[i];
                }
            }
            else {
                hash.put(arr[i],1);
            }
        }
        return mostFreq;
    }
}
