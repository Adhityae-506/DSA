// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Example 2:

// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.
// Example 3:

// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

class Solution {
    public String reverseWords(String s) {

        s = s.replaceAll("\\s+"," ").trim();
        
        Stack<String> reversed = new Stack<>();
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++)
        {
            reversed.push(words[i]);
        }

        StringBuilder result = new StringBuilder();
        while(!reversed.isEmpty()){

            result.append(reversed.pop());
            if(!reversed.isEmpty()) result.append(" ");
        }
        return result.toString();
    }
}