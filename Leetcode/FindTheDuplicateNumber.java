class Solution {
    //287. Find the Duplicate Number
    public void swap(int[] nums, int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            int rightIdx = nums[i] - 1; 
            if(nums[i] == i + 1 || nums[rightIdx] == nums[i]) i++;
            else swap(nums , i , rightIdx);
        }
        for(int j= 0 ; j < nums.length;j++){
            if(nums[j] != j + 1){
                return nums[j];
            }
        }
        return -1;
    }
}