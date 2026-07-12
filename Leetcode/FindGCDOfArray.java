class Solution {
    //1979. Find Greatest Common Divisor of Array
    public int findGCD(int[] arr) {
        int gcd = 0 ;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return gcd(min,max);
    }
    public int gcd(int a , int b){
        if(a == 0) return b;
        return gcd(b % a, a);
    }
}