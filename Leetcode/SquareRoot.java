class Solution {
    //69. Sqrt(x)
    public int mySqrt(int x) {
        long low = 1;
        long high = x;
        long idx = 0;
        // if(x == 1) return x;
        while(low <= high){
            long mid = (low + high)/2;
            if(mid * mid <= x){
                idx = mid;
                low = mid + 1;
            }
            if(mid * mid > x){
                high = mid -1;
            }
        }

        return (int)idx;
    }
}