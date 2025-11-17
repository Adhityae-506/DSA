// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
// Example 3:

// Input: nums = [1,0,1,2]
// Output: 3


class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> result = new HashSet<>();
        for(int n : nums){
            result.add(n);
        }
        
        int longSeq = 0;
        for(int num : result){
            if(!result.contains(num - 1)){
                int current = num;
                int longest = 1;

                while(result.contains(current + 1)){
                    current++;
                    longest++;
                }
                longSeq = Math.max(longSeq,longest);
            }
        }
        return longSeq;
        
    }
}