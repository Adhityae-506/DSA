// Example 1:

// Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
// Output: 6
// Explanation: 
// - The first sentence, "alice and bob love leetcode", has 5 words in total.
// - The second sentence, "i think so too", has 4 words in total.
// - The third sentence, "this is great thanks very much", has 6 words in total.
// Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
// Example 2:

// Input: sentences = ["please wait", "continue to fight", "continue to win"]
// Output: 3
// Explanation: It is possible that multiple sentences contain the same number of words. 
// In this example, the second and third sentences (underlined) have the same number of words.

class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int Maxcount = 0;

        for(String s : sentences){
            int countSpace = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    countSpace++;
                }
            }
            int wordCount = countSpace + 1;

            if(wordCount > Maxcount){
                Maxcount = wordCount;
            }
        }
        return Maxcount;
    }
}
        