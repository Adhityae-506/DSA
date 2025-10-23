// Example 1:

// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
// Example 2:

// Input: nums = [2,1,3,4]
// Output: false
// Explanation: There is no sorted array once rotated that can make nums.
// Example 3:

// Input: nums = [1,2,3]
// Output: true
// Explanation: [1,2,3] is the original sorted array.
// You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

class Solution {
    public boolean check(int[] nums) {

        int disOrderCount = 0;
        for(int i=0;i<nums.length - 1;i++){
            if(nums[i]>nums[i+1]){
                disOrderCount++;
            }
        }
        if(nums[nums.length - 1] > nums[0]){
            disOrderCount++;
        }
        return disOrderCount <= 1;
        
    }
}