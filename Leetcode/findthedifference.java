class Solution {
    public char findTheDifference(String s, String t) {
		// leetcode 389. Find the Difference
        int tsum = 0;
        int ssum = 0 ;

        for(int i = 0 ; i < t.length(); i++){
            tsum += t.charAt(i);
        }
        for(int i = 0 ; i < s.length();i++){
            ssum += s.charAt(i);
        }

        return (char)(tsum - ssum);
    }
}