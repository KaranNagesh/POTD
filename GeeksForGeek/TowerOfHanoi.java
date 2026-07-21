class Solution {
    static int count ;
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        count = 0;
        honoi(n,from,to,aux);
        return count;
        
    }
    public void honoi(int n , int a , int b  , int c){
        if(n == 0) return;
        honoi(n-1, a , c ,b);
        count++;
        honoi(n-1,b,a,c);
    }
    
}