// Example 1:

// Input: nums = [1,2,5,9], threshold = 6
// Output: 5
// Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
// If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
// Example 2:

// Input: nums = [44,22,33,11,1], threshold = 5
// Output: 44

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int low = 1;
        int high = 0;

        for(int num : nums){
            high = Math.max(high, num);
        }

        while(low < high)
        {
            int mid = (low + high) / 2;

            int sum = 0;
            for(int num : nums){
                sum += (num + mid - 1)/mid;
            }

            if(sum > threshold)
            {
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}