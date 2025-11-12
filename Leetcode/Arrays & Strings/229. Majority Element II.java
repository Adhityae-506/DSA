// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]


//Need to try this with hashmap again

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        int occur = nums.length/3;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        int range = max - min + 1;
        int freq[] = new int[range];

        for (int num : nums) {
            freq[num - min]++;
        }
        for (int i = 0; i < range; i++) {
            if (freq[i] > occur) {
                result.add(i + min);
            }
        }

        return result;
    }
}