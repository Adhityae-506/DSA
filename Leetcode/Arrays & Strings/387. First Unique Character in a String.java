// Example 1:

// Input: s = "leetcode"

// Output: 0

// Explanation:

// The character 'l' at index 0 is the first character that does not occur at any other index.

// Example 2:

// Input: s = "loveleetcode"

// Output: 2

// Example 3:

// Input: s = "aabb"

// Output: -1

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < length; i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; 
    }
}
