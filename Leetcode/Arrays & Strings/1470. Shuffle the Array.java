// Example 1:

// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7] 
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
// Example 2:

// Input: nums = [1,2,3,4,4,3,2,1], n = 4
// Output: [1,4,2,3,3,2,4,1]
// Example 3:

// Input: nums = [1,1,2,2], n = 2
// Output: [1,2,1,2]

class Solution {
    public int[] shuffle(int[] nums, int n) {

    ///BRUTE FORCE
        // int[] arr1 = new int[n];
        // int[] arr2 = new int[n];
        // int j = 0;
        // for(int i=0;i<n;i++){
        //     arr1[j++] = nums[i];
        // }
        // j = 0;
        // for(int i=n;i<nums.length;i++){
        //     arr2[j++] = nums[i];
        // }
        
        // int[] result = new int[nums.length];
        // int k = 0;
        // for (int i = 0; i < n; i++) {
        //     result[k++] = arr1[i]; 
        //     result[k++] = arr2[i]; 
        // }

        // return result;

///OPTIMIZED APPROACH
        int[] res = new int[nums.length];
        int k = 0;
        for(int i = 0;i<n;i++){
            res[k++] = nums[i];
            res[k++] = nums[i+n];
        }
        return res;
    }
}