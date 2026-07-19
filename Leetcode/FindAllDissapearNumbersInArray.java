class Solution {
    //448. Find All Numbers Disappeared in an Array
    public void swap(int[] nums,int i , int j){
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        while( i < n ){
            int rightIdx = nums[i] - 1;
            if(nums[i] == i+1 || nums[rightIdx] == nums[i]) i++;
            else swap(nums,i , rightIdx);
        }
        for(i = 0 ;i < n;i++){
            if(nums[i] != i + 1) list.add(i+1);
        }
        return list;
    }
}