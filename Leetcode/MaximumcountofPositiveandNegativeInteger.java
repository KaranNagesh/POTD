class Solution {
    //2529. Maximum Count of Positive Integer and Negative Integer
    public int maximumCount(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        int idxneg = -1;
        //last index of negative
        while(low <= high){
            int mid = (high + low)/2;
            if(nums[mid] < 0){
                idxneg = mid;
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }

        //first index of positive
        low = 0;
        high = nums.length -1;
        int idxpos = nums.length;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid]>0){
               idxpos = mid;
               high = mid - 1;
          
            } else {
                low = mid + 1;
            }
        }

        int finalneg = idxneg + 1;
        int finalpos = ( nums.length - idxpos);

        if(finalneg == finalpos) return finalneg;
        if(finalneg > finalpos) return finalneg;
        return finalpos;
    }
}