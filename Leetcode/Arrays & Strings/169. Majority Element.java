// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int times = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                } else {
                    break; 
                }
            }
            if (count > times) {
                return nums[i];
            }
        }
        return -1;
    }
}
