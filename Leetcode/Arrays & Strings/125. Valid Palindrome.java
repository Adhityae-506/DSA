// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.

class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.equals(" ")){
            return true;
        }
        String modified = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(modified);
        String reversed = sb.reverse().toString();

        if(modified.length()!=reversed.length()) return false;

        for(int i=0;i<modified.length();i++){
            if(modified.charAt(i)!=reversed.charAt(i)){
                return false;
            }
        }
        return true;

        // int left = 0;
        // int right = s.length() - 1;
        
        // while(left < right){

        //     while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
        //         left++;
        //     }
        //     while(left > right && !Character.isLetterOrDigit(s.charAt(right))){
        //         right--;
        //     }
        //     if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
        //         return false;
        //     }
        // }
        // return true;
    }
}