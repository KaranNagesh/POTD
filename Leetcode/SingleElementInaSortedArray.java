class Solution {
    public int singleNonDuplicate(int[] nums) {
        // 540. Single element in a sorted array
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        for(int i = 1 ; i < nums.length;i++){
            if(nums[0] != nums[1] ){
                return nums[0];
            }
            
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1] ){
                return nums[i];
            }

            if(nums[n-2] != nums[n -1]){
                return nums[n - 1];
            }
        }
        return -1;
    }
}