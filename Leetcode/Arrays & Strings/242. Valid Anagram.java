// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false


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

