// Example 1:
// Input: mat = [[1,2,3],
//               [4,5,6],
//               [7,8,9]]
// Output: 25

// Example 2:

// Input: mat = [[1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1]]
// Output: 8

// Example 3:
// Input: mat = [[5]]
// Output: 5

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    sum += mat[i][j];  
                }
            }
        }

        for(int i=0;i<mat.length;i++){
                sum += mat[len - 1- i][i];

        }
        
        if(len%2==1){
            int midIndex = len/2;
            sum-=mat[midIndex][midIndex];
        }
        return sum;
    }
}

// |
// |
// |
// |
// |
// __> Optimized code O(n);

// Method 1:
class Solution {
    public int diagonalSum(int[][] mat) {
          
        int sum = 0;
        int len = mat.length;
        for(int i=0;i<len;i++){
                    sum += mat[i][i];
                    sum += mat[i][len-1-i];
            
        }

        if(len%2==1){
            int midIndex = len/2;
            sum-=mat[midIndex][midIndex];
        }
        return sum;
    }
}

// Method - 2:

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    sum += mat[i][j];  
                    break;
                }
            }
        }

        for(int i=0;i<mat.length;i++){
                sum += mat[len - 1- i][i];

        }
        
        if(len%2==1){
            int midIndex = len/2;
            sum-=mat[midIndex][midIndex];
        }
        return sum;
    }
}