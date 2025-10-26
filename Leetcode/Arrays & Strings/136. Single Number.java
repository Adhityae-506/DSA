// Example 1:

// Input: nums = [2,2,1]

// Output: 1

// Example 2:

// Input: nums = [4,1,2,1,2]

// Output: 4

// Example 3:

// Input: nums = [1]

// Output: 1

class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int op = 0;
        for(int i = 0;i<len;i++){
            op = op ^ nums[i];
        }
        return op;
    }
}
// Brute Force:
//int len = nums.length;
// for(int num : nums){
//     int count = 0;
//     for(int i=0;i<len;i++){
//         if(nums[i]==num){
//             count++;
//         }
//     }
//     if(count == 1){
//         return num;
//     }

// }
// return -1;