class Solution {
    //54. Spiral Matrix
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int right = matrix[0].length ;
        int bottom = matrix.length ;
        int left = 0;
        List<Integer> ans = new ArrayList<>();
        while(top < bottom && left < right){
            for(int j = left ; j < right ; j++){
                ans.add(matrix[top][j]);
            }
            top++;
            for(int i = top  ; i < bottom ; i++){
                ans.add(matrix[i][right - 1]);
            }
            right--;
            if(top < bottom){
            for(int j = right - 1  ; j > left - 1; j--){
                ans.add(matrix[bottom - 1][j]);
            }
            bottom--;
            }
            if(left < right){
            for(int i = bottom - 1 ; i > top - 1  ;i--){
                ans.add(matrix[i][left]);
            }
            left++;
            }
        }
        return ans;
    }
}