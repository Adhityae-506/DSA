// Example 1:

// Input: nums = [1,2,2,3]
// Output: true
// Example 2:

// Input: nums = [6,5,4,4]
// Output: true
// Example 3:

// Input: nums = [1,3,2]
// Output: false

class Solution {
    public boolean isMonotonic(int[] nums) {
        
        boolean incresing = true, decresing = true;
        for(int i=0;i<nums.length - 1;i++){ 
            if(nums[i] > nums[i + 1]){
                incresing = false;
            }
            if(nums[i] < nums[i + 1]){
                decresing = false;
            }
        }
        return incresing || decresing;
    }
}