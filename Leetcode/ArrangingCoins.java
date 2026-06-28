class Solution {
    // 441. Arranging Coins
    public int arrangeCoins(int n) {
        long low = 0, high = n , ans = 0;
        while(low <= high){
            long mid = low + (high - low) /2;
            long coinneed = mid * (mid + 1)/2;
            if(coinneed == n) return (int) mid;
            if(coinneed < n){
                ans = mid ;
                low = mid + 1;}
            else high = mid - 1;
        }

        return (int) ans;
    }
}