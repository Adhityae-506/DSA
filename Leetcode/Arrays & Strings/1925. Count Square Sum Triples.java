// Example 1:

// Input: n = 5
// Output: 2
// Explanation: The square triples are (3,4,5) and (4,3,5).
// Example 2:

// Input: n = 10
// Output: 4
// Explanation: The square triples are (3,4,5), (4,3,5), (6,8,10), and (8,6,10).


class Solution {
    public int countTriples(int n) {
        int count = 0; 
        
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int s = i * i + j * j; 
                int r = (int) Math.sqrt(s); 
                
                if (r > n) break;
                
                if (r * r == s) {
                    count += 2;
                }
            }
        }
        return count;
    }
}