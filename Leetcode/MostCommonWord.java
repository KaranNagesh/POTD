class Solution {
    public boolean banornot(String str,String[] banned){
        // 819. Most Common Word
        for(int i = 0 ; i < banned.length;i++){
            if(str.equals(banned[i])){
                return true;
            }
        }
        return false;
    }
    public String mostCommonWord(String paragraph, String[] banned) {
        String lc = paragraph.toLowerCase();
        String woutsymbol = lc.replaceAll("[.,:';!?]", " ");
        String[] arr = woutsymbol.split("\\s+");
        Map<String,Integer> map = new HashMap<>();
        int max = 0;
        String res  = "";
        for(int i = 0 ; i < arr.length;i++){
            if(map.containsKey(arr[i]) ){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else{
                if(!banornot(arr[i],banned))
                map.put(arr[i],1);
            }
        }

        for(String s : map.keySet()){
            if(map.get(s) > max) {
                res = s;
                max = map.get(s);
            }
        
        }
        
        return res;
    }
}