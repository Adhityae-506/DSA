// Input: s1 = "geeks" s2 = "kseeg"
// Output: true 
// Explanation: Both the string have same characters with same frequency. So, they are anagrams.
// Input: s1 = "allergy", s2 = "allergyy" 
// Output: false 
// Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. 
// Input: s1 = "listen", s2 = "lists" 
// Output: false 
// Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.

class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] freq = new int[256];

        for(int i=0;i<s.length();i++)
        {
            int ascii1 = (int)s.charAt(i);
            freq[ascii1]++;  
        }

        for(int i=0;i<t.length();i++)
        {
            int ascii2 = (int)t.charAt(i);
            freq[ascii2]--;
        }
        for(int i=0;i<256;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}