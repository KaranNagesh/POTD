class Solution {
    //74. Search a 2D Matrix
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length , col = matrix[0].length;
        int low = 0 , high = row * col - 1;
        while(low <= high){
            int mid = (low + high)/2;
            int midrow = mid/col ;
            int midcol = mid%col ;
            if(matrix[midrow][midcol] == target) return true;
            else if(matrix[midrow][midcol] > target){
                high = mid -1;
            } else{
                low = mid + 1;
            }
        }
        return false;
    }
}