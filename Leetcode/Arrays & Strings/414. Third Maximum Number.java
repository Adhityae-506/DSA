// Example 1:

// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.
// Example 2:

// Input: nums = [1,2]
// Output: 2
// Explanation:
// The first distinct maximum is 2.
// The second distinct maximum is 1.
// The third distinct maximum does not exist, so the maximum (2) is returned instead.
// Example 3:

// Input: nums = [2,2,3,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2 (both 2's are counted together since they have the same value).
// The third distinct maximum is 1.

class Solution {
    public int thirdMax(int[] nums) {

        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        int distinct = 0;

        for (int num : nums) {

            if (num == max1 || num == max2 || num == max3) {
                continue;
            }

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
                distinct++;
            }
            else if (num > max2) {
                max3 = max2;
                max2 = num;
                distinct++;
            }
            else if (num > max3) {
                max3 = num;
                distinct++;
            }
        }

        return distinct >= 3 ? (int) max3 : (int) max1;
    }
}
// class Solution {
//     public int thirdMax(int[] nums) {

//         Integer max1 = null, max2 = null, max3 = null;

//         for (int i = 0; i < nums.length; i++) {
//             if ((max1 != null && nums[i] == max1) ||
//                     (max2 != null && nums[i] == max2) ||
//                     (max3 != null && nums[i] == max3)){
//                 continue;
//             }

//             if(max1 == null || nums[i] > max1){
//                 max3 = max2;
//                 max2 = max1;
//                 max1 = nums[i];
//             }
//             else if(max2 == null || nums[i] > max2){
//                 max3 = max2;
//                 max2 = nums[i];
//             }
//             else if(max3 == null || nums[i] > max3){
//                 max3 = nums[i];
//             }
//         }
//         return max3 == null ? max1 : max3;
//     }
// }

