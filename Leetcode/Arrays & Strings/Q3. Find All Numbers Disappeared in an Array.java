// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:

// Input: nums = [1,1]
// Output: [2]

import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List <Integer> result = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for(int num : nums){
            freq[num]++;
        }

        for(int i=1;i<=nums.length;i++){
            if(freq[i]==0){
                result.add(i);
            }
        }
        return result;
    }
}