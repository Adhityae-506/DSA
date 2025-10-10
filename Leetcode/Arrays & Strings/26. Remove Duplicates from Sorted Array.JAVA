// Example 1:

// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
// Example 2:

// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).


class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> result = new LinkedHashSet<>();

        for(int elements : nums){
            result.add(elements);
        }
        int size = result.size();
        int i = 0;
        for(int val : result){
            nums[i++] = val;
        }

        return size;

        /* OPTIMISED APPROACH */

        // if(nums==null || nums.length==0) return 0;

        // int j = 1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[j - 1]){
        //         nums[j] = nums[i];
        //         j++;
        //     }
        // }
        // return j;

        
    }
}