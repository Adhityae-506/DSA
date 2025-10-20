// Example 1:

// Input: nums = [1,15,6,3]
// Output: 9
// Explanation: 
// The element sum of nums is 1 + 15 + 6 + 3 = 25...
// The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
// The absolute difference between the element sum and digit sum is |25 - 16| = 9.
// Example 2:

// Input: nums = [1,2,3,4]
// Output: 0
// Explanation:
// The element sum of nums is 1 + 2 + 3 + 4 = 10.
// The digit sum of nums is 1 + 2 + 3 + 4 = 10.
// The absolute difference between the element sum and digit sum is |10 - 10| = 0.

class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
        }

        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
        }

        int totSum = elementSum - digitSum;

        return totSum;
    }
}