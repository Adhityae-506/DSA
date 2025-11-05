// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]

class Solution {
    public int[] searchRange(int[] nums, int target) {
        //Brute Force
        // int start = -1;
        // int end = -1;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         if(start==-1){
        //             start = i;
        //         }
        //         end = i;
        //     }
        // }
        // return new int[] {start,end};
        int first = findBound(nums, target, true);
        int last = findBound(nums, target, false);
        return new int[] {first, last};
    }
    public int findBound(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}