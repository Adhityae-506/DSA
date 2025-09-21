import java.util.*;

// Example 1:

// Input: arr = [3,5,1]
// Output: true
// Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
// Example 2:

// Input: arr = [1,2,4]
// Output: false
// Explanation: There is no way to reorder the elements to obtain an arithmetic progression.


class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int size = arr.length;
        Arrays.sort(arr);
        int[] differences = new int[size - 1];
        int j = 0;
        for(int i=0;i<size - 1;i++)
        {
            if(size <= 1) return false;
            differences[j++] = arr[i] - arr[i + 1];
        }

        for(int diff=0;diff<differences.length - 1;diff++)
        {
            if(differences[diff]!=differences[diff+1]) return false;
        }
        return true;

    }
}