class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1;
        int secondLargest = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest ;
                largest = arr[i];
            }
        }
        return secondLargest;
    }
}