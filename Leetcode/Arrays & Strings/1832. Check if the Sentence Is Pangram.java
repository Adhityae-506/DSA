// Example 1:

// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English alphabet.
// Example 2:

// Input: sentence = "leetcode"
// Output: false

class Solution {
    public boolean checkIfPangram(String sentence) {
        int freq[] = new int[26];
        
        for(int i=0;i<sentence.length();i++){
            freq[sentence.charAt(i) - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i]<1){
                return false;
            }
        }
        return true;
    }
}