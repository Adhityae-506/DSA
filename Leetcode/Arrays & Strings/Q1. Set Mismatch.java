// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

// Example 1:

// Input: nums = [1,2,2,4]
// Output: [2,3]
// Example 2:

// Input: nums = [1,1]
// Output: [1,2]

class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int n = nums.length;
        int[] freq = new int[n + 1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int duplicate = 0;
        int missing = 0;
        for(int fre = 1;fre<freq.length;fre++)
        {
            if(freq[fre]==2){
                duplicate = fre;
            }
            else if(freq[fre]==0){
                missing = fre;
            }
        }
        return new int[]{duplicate,missing};
    }
}