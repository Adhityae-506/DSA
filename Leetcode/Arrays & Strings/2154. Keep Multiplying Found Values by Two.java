// Example 1:

// Input: nums = [5,3,6,1,12], original = 3
// Output: 24
// Explanation: 
// - 3 is found in nums. 3 is multiplied by 2 to obtain 6.
// - 6 is found in nums. 6 is multiplied by 2 to obtain 12.
// - 12 is found in nums. 12 is multiplied by 2 to obtain 24.
// - 24 is not found in nums. Thus, 24 is returned.
// Example 2:

// Input: nums = [2,7,9], original = 4
// Output: 4
// Explanation:
// - 4 is not found in nums. Thus, 4 is returned.

class Solution {
    public int findFinalValue(int[] nums, int original) {
        int i = 0;
        while(true){
            boolean found = false;
            i = 0;

            while(i < nums.length){
                if(nums[i]==original){
                    original = original * 2;
                    found = true;
                    break;
                }
                i++;
            }
            if(!found){
                return original;
            }
        }

        // Set<Integer> result = new HashSet<>();
        // for(int num : nums){
        //     result.add(num);
        // }
        // while(result.contains(original)){
        //     original *= 2;
        // }
        // return original;
    }
}