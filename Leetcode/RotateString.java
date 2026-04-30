class Solution {
    // 796. Rotate String
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String str = s;
        str += s;
        if(str.contains(goal)){
            return true;
        }

        return false;
    }
}