// Example 1:

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1
// Example 2:

// Input: n = 2
// Output: false

class Solution {
    public boolean isHappy(int n) {

        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int unit = n % 10;
                sum += unit * unit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}