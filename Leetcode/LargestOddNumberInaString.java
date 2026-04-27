class Solution {
    // 1903. Largest Odd Number in String
    public String largestOddNumber(String num) {
        int i = num.length() - 1;
        int n = num.length() - 1;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int number = 0;
        String res = "";
        while(i >= 0){
            String s = "";
            s += num.charAt(i);
            number = Integer.parseInt(s);
            if(number % 2 != 0 && i == n){
                return num;
            }
            if(number % 2 != 0 && number > max){
                return num.substring(0 , i + 1);
            }


            i--;
        }

        return res;
    }
}