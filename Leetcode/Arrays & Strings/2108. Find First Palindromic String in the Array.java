// Example 1:

// Input: words = ["abc","car","ada","racecar","cool"]
// Output: "ada"
// Explanation: The first string that is palindromic is "ada".
// Note that "racecar" is also palindromic, but it is not the first.
// Example 2:

// Input: words = ["notapalindrome","racecar"]
// Output: "racecar"
// Explanation: The first and only string that is palindromic is "racecar".
// Example 3:

// Input: words = ["def","ghi"]
// Output: ""
// Explanation: There are no palindromic strings, so the empty string is returned.
class Solution {
    public String firstPalindrome(String[] words){
        // String[] alpha = words.split(" ");

        for(String s:words){
            StringBuilder sb = new StringBuilder(s);
            String revStr = sb.reverse().toString();
            if(s.equals(revStr)){
                return s;
            }
        }
        return "";
    }
}