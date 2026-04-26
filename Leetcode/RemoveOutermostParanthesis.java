class Solution {
    //1021. Remove Outermost Paranthesis
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder("");
        int level  = 0;
        // int j = 1;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i) == '('){
                if(level > 0){
                    sb.append(s.charAt(i));
                }
                    level++;
            }
             else if(s.charAt(i) == ')'){
                level--;
                if(level > 0){
                    sb.append(s.charAt(i));
                    
                }
            }
        }

        return sb.toString();
    }
}