// Example 1:

// Input: num = "52"
// Output: "5"
// Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
// Example 2:

// Input: num = "4206"
// Output: ""
// Explanation: There are no odd numbers in "4206".
// Example 3:

// Input: num = "35427"
// Output: "35427"
// Explanation: "35427" is already an odd number...

class Solution {
    public String largestOddNumber(String num) {
        
        for(int i = num.length() - 1;i>=0;i--)
        {
            if((num.charAt(i) - '0') % 2 != 0)
            {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}