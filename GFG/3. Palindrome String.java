// Input: s = "abba"
// Output: true
// Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
// Input: s = "abc" 
// Output: false
// Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.

class Solution {
    boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=reversed.charAt(i))
            {
                return false;
            }    
        }
        return true;
    }
}