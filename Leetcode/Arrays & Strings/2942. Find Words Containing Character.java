// Example 1:

// Input: words = ["leet","code"], x = "e"
// Output: [0,1]
// Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
// Example 2:

// Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
// Output: [0,2]
// Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
// Example 3:

// Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
// Output: []

// Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
import java.util.*;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> numbers = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String pivot = words[i];
            for(int j=0;j<pivot.length();j++){
                if(pivot.charAt(j)==x){
                    numbers.add(i);
                    break;
                }
            }
        }
        return numbers;
    }
}