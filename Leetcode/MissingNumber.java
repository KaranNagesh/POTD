class Solution {
    // 268. Missing Number
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        int n = nums.length + 1;
        int expectedSum = n * (n-1)/2;
        for(int i = 0 ; i < nums.length;i++){
            actualSum += nums[i];
        }
        return expectedSum - actualSum;
    }
}