class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int low = 0;
        int high = arr.length -1;
        int idx = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] <= x){
                idx = mid ;
                low = mid + 1;
            }
            if(arr[mid] > x){
                high = mid - 1;
            }
            
        }
        return idx;
    }
}