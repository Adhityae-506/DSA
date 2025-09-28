// Example 1:

// Input: nums = [-1,-2,-3,-4,3,2,1]
// Output: 1
// Explanation: The product of all values in the array is 144, and signFunc(144) = 1
// Example 2:

// Input: nums = [1,5,0,2,-3]
// Output: 0
// Explanation: The product of all values in the array is 0, and signFunc(0) = 0
// Example 3:

// Input: nums = [-1,1,-1,1,-1]
// Output: -1
// Explanation: The product of all values in the array is -1, and signFunc(-1) = -1


class Solution {

    public int arraySign(int[] nums) {
        int ArrSize = nums.length;
        int count = 0;
        
        for(int i=0;i<ArrSize;i++)
        {
            if(nums[i]==0)
                return 0;
            if(nums[i]<0)
                count++;
        }
        if(count%2==0)
            return 1;
        if(count%2!=0)
            return -1;
        return 0;
        
    }
}


