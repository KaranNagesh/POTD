class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                arr.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] > b[j]){
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
        }
        return arr;
    }
}