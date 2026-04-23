class Solution {
    // 485. Max Consecutive Ones
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int sum = 0;
        for(int i = 0 ;i < nums.length;i++){
            if(nums[i] == 1){
                sum++;
                
            }else{
                sum = 0;
            }
            maxi = Math.max(maxi,sum);
        }
        
        
        return maxi;
    }
}