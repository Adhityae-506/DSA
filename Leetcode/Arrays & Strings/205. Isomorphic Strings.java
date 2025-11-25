// Example 1:

// Input: s = "egg", t = "add"

// Output: true

// Explanation:

// The strings s and t can be made identical by:

// Mapping 'e' to 'a'.
// Mapping 'g' to 'd'.
// Example 2:

// Input: s = "foo", t = "bar"

// Output: false

// Explanation:

// The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

// Example 3:

// Input: s = "paper", t = "title"

// Output: true

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for(int i=0;i<s.length();i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(mapS[a]==0 && mapT[b]==0){
                mapS[a] = b;
                mapT[b] = a;
            }
            else if(mapS[a]!=b){
                return false;
            }
        }
        return true;
    }
}