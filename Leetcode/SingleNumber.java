class Solution {
    // 136. Single Number
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            } else{
                map.put(nums[i] , 1);
            }
        }

        for(int n : nums){
            if(map.get(n) == 1){
                return n;
            }
        }

        return -1;
    }
}