class Solution {
    //231. Power of Two
    public boolean pow(int n , double a){
        if( n == a) return true;
        else if(n > a) return pow(n , a * 2);
        return false;
    }
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        return pow(n , 2);
         
    } 
}