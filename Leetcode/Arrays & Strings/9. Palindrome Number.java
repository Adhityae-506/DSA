// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int reverse = 0;
        int original = x;
        
        while(original!=0){
            int digit = original % 10;
            reverse = reverse * 10 + digit;
            original/=10;
        }
        if(reverse == x){
            return true;
        }
        return false;
    }
}
