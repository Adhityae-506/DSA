// Example 1:

// Input: s = "abcd", t = "abcde"
// Output: "e"
// Explanation: 'e' is the letter that was added.
// Example 2:

// Input: s = "", t = "y"
// Output: "y" .

class Solution {
    public char findTheDifference(String s, String t) {

        char result;
        int sum1 = 0;
        for(int i=0;i<=s.length()-1;i++){
            int asciiS = (int)s.charAt(i);
            sum1 += asciiS;
        }
        int sum2 = 0;
        for(int i=0;i<=t.length()-1;i++)
        {
            int asciiT = (int)t.charAt(i);
            sum2 += asciiT; 
        }
        int diffAscii = Math.abs(sum1-sum2);
        result = (char)diffAscii;
        return result;
    }
}

