// Example 1:

// Input: n = 5, start = 0
// Output: 8
// Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
// Where "^" corresponds to bitwise XOR operator.
// Example 2:

// Input: n = 4, start = 3
// Output: 8
// Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.

class Solution {
    public int xorOperation(int n, int start) {
        if(n == 1) return start;
        int[] nums = new int[n];
        int j = 0;
        for(int i=0;i<n;i++){
            nums[j++] = start + 2 * i;
        }
        int result = 0;
        for(int i=nums.length - 2;i>=0;i--){
            for(int k=0;k<i+1;k++){
                nums[k] = nums[k] ^ nums[k+1];
                result = nums[k];
            }
        }
        return result;

    }
}