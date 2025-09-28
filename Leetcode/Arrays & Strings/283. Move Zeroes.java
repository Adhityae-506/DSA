// Example 1

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

class Solution {
    public void moveZeroes(int[] nums) {
        
        int insertPos = 0;
        for(int num : nums)
        {
            if(num!=0)
            {
                nums[insertPos++] = num;
            }

        }
        while(insertPos<nums.length){
            nums[insertPos++] = 0;
        }
    }

}b
