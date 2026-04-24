class Solution {
    public String reverseWords(String s) {
        //151. Reverse Words in a String
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(int i = arr.length - 1;i >= 0 ; i--){
            if(arr[i].equals(" ")){
                continue;
            }
            if(i == 0){
                sb.append(arr[i]);
                break;
                
            }else if(!arr[i].equals(" ")){
            sb.append(arr[i]);
            sb.append(" ");
            }
        }

        return sb.toString();
    }
}