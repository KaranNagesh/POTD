class Solution {

	// leetcode 219 - contains duplicate 2;

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0 ; 
        for(int i : nums){
            if(map.containsKey(i) && Math.abs(index - map.get(i)) <= k){
                return true;
            } else{
                map.put(i,index);
            }
            index++;
        }

        return false;
    }
}