class Solution {
    //33. Search in Rotated Sorted Array
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
       
        while(low <= high){
            int mid = low + (high-low) / 2;
            if(nums[low] == target) return low;
            if(nums[high] == target) return high;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target){
                if(nums[low] < nums[mid] && target < nums[low]){
                    low = mid + 1;
                } else{
                    high = mid -1;
                }
            } else{
                if(nums[mid] < nums[low] && nums[low] < target){
                    high = mid -1;
                } else{
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
}