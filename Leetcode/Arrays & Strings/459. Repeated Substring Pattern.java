// Example 1:

// Input: s = "abab"
// Output: true
// Explanation: It is the substring "ab" twice.
// Example 2:

// Input: s = "aba"
// Output: false
// Example 3:

// Input: s = "abcabcabcabc"
// Output: true
// Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String modified = s + s;
        String trimStr = modified.substring(1,modified.length()-1);
        return trimStr.contains(s);
    }
}
