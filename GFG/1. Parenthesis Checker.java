// Input: s = "[{()}]"
// Output: true
// Explanation: All the brackets are well-formed.
// Input: s = "[()()]{}"
// Output: true
// Explanation: All the brackets are well-formed.
// Input: s = "([]"
// Output: false
// Explanation: The expression is not balanced as there is a missing ')' at the end.
// Input: s = "([{]})"
// Output: false
// Explanation: The expression is not balanced as there is a closing ']' before the closing '}'.
class Solution {
    public boolean isBalanced(String s) {
        // code here
        long OpenCount = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                OpenCount++;
            }
        }
        
        long CloseCount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
            {
                CloseCount++;
            }
        }
        if(OpenCount!=CloseCount)
        {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            {
                stack.push(ch);
            }else if(ch==')'||ch=='}'||ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch==')' && top!='(') ||
                    (ch=='}' && top!='{') ||
                    (ch==']' && top!='[')){
                        return false;
                    }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        
        return true;
        
    }
}
