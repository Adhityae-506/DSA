// Example 1:

// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]
// Example 2:

// Input: nums = [1,3,2,1]
// Output: [1,3,2,1,1,3,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
// - ans = [1,3,2,1,1,3,2,1]


class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums1 = new int[nums.length];

        int j = 0;
        for(int i = 0;i < nums.length;i++)
        {
            nums1[j++] = nums[i];
        }
        int[] concat = new int[nums.length + nums1.length];
        System.arraycopy(nums,0,concat,0,nums.length);
        System.arraycopy(nums1,0,concat,nums.length,nums1.length);

        return concat;
    }
}