// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultset = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        
        for(int j = 0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                resultset.add(nums2[j]);
            }
        }
        int[] result = new int[resultset.size()];
        int ctr = 0;
        for(int value : resultset){
            result[ctr++] = value;
        }
        return result;

        // Set<Integer> set = new HashSet<>();

        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums2[j]==nums1[i]) {set.add(nums1[i]);}
        //     }
        // }
        // int[] result = new int[set.size()];
        // int ctr = 0;
        // for(int value : set){
        //     result[ctr++] = value;
        // }
        // return result;

    }
}