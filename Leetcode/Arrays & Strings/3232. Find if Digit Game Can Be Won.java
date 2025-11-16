// Example 1:

// Input: nums = [1,2,3,4,10]

// Output: false

// Explanation:

// Alice cannot win by choosing either single-digit or double-digit numbers.

// Example 2:

// Input: nums = [1,2,3,4,5,14]

// Output: true

// Explanation:

// Alice can win by choosing single-digit numbers which have a sum equal to 15.

// Example 3:

// Input: nums = [5,5,5,25]

// Output: true

// Explanation:

// Alice can win by choosing double-digit numbers which have a sum equal to 25.

class Solution {
    public boolean canAliceWin(int[] nums) {
        int doubleDigit = 0;
        int singleSum = 0;
        for(int num : nums){
            if(num >= 10){
                doubleDigit += num;
            }
            else{
                singleSum += num;
            }
        }
        if(singleSum == doubleDigit){
            return false;
        }
        else if(singleSum > doubleDigit){
            return true;
        }
        return true;
    }
}