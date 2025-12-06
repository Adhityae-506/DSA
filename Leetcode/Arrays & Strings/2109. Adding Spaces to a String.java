// Example 1:

// Input: s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
// Output: "Leetcode Helps Me Learn"
// Explanation: 
// The indices 8, 13, and 15 correspond to the underlined characters in "LeetcodeHelpsMeLearn".
// We then place spaces before those characters.
// Example 2:

// Input: s = "icodeinpython", spaces = [1,5,7,9]
// Output: "i code in py thon"
// Explanation:
// The indices 1, 5, 7, and 9 correspond to the underlined characters in "icodeinpython".
// We then place spaces before those characters.
// Example 3:

// Input: s = "spacing", spaces = [0,1,2,3,4,5,6]
// Output: " s p a c i n g"
// Explanation:
// We are also able to place spaces before the first character of the string.

class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        StringBuilder result = new StringBuilder();
        int ctr = 0;
        
        for(int i=0;i<s.length();i++)
        {
            if(ctr<spaces.length && i==spaces[ctr]){
                result.append(" ");
                ctr++;
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}