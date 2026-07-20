class Solution {
    //41. First Missing Positive
    public void swap(int[] nums, int i ,int j){
        int temp = nums[i] ;
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            int rightIdx = nums[i] - 1;
            if(nums[i] <= 0 || nums[i] >= n || nums[i] == i+1 || nums[i] == nums[rightIdx]) i++;
            else swap(nums,i,rightIdx);
        }
        for(i = 0 ; i < nums.length;i++){
            if(nums[i] != i+1) return i + 1;
        }

        return n+1;
    }
}