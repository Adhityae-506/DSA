// Example 1

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].

class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = digits[i];
        }

        for (int i = size - 1; i >= 0; i--) {
            result[i]++;
            if (result[i] < 10) {
                return result;
            }
            result[i] = 0;
        }

        int[] newResult = new int[size + 1];
        newResult[0] = 1;
       
        return newResult;
    }
}

