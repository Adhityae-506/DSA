// Example 1:


// Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
// Output: true
// Example 2:


// Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
// Output: false

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0;i<rows;i++){
            if(target >= matrix[i][0] && target <= matrix[i][cols - 1]){
                int left = 0;
                int right = cols - 1;
                while(left <= right){
                    int mid = left + (right - left)/2;
                    if(matrix[i][mid]==target){
                        return true;
                    }else if(target > matrix[i][mid]){
                        left = mid + 1;
                    }else{
                        right = mid - 1;
                    }
                }
            }
        }
        return false;
    }
}
