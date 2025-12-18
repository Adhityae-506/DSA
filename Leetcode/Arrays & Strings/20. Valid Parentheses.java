// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true

// Example 5:

// Input: s = "([)]"

// Output: false

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> result = new Stack<>();

        for(char ch : s.toCharArray())
        {
            if(ch =='(' || ch =='{' || ch =='['){
                result.add(ch);
            }
            else{
                if(result.isEmpty()){
                    return false;
                }
                char top = result.pop();

                if(ch == ')' && top != '(') return false;
                if(ch == '}' && top != '{') return false;
                if(ch == ']' && top != '[') return false;
            }
        }
        return result.isEmpty();
    }

}