// Example 1:
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]

// Example 2:
// Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]




import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        int left = 0, right = C - 1;
        int top = 0, bottom = R - 1;
        List<Integer> numbers = new ArrayList<>();

        while(top <= bottom && left <= right){
            for(int i=left;i<=right;i++){
                numbers.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                numbers.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i=right;i>=left;i--){
                    numbers.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){

                for(int i=bottom;i>=top;i--){
                    numbers.add(matrix[i][left]);
                }
                left++;
            }
        }

    return numbers;
    }

}
