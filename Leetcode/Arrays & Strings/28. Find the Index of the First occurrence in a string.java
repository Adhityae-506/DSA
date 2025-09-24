// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.



class Solution {
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        if(index == -1) return -1;
        return index;
    }
}