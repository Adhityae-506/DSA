// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
// Example 3:

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                len = 0;
            }
            else{
                len++;
            }
        }
        return len;
    }
}