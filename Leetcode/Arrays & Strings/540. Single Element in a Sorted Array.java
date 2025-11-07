// Your solution must run in O(log n) time and O(1) space.

 

// Example 1:

// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2
// Example 2:

// Input: nums = [3,3,7,7,10,11,11]
// Output: 10


class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;

            if(mid % 2 != 0){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                left = mid + 2;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}
