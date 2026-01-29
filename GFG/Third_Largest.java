class Solution {
    int thirdLargest(int arr[]) {
        // code here
        if(arr.length<3)
        {
            return -1;
        }
        Arrays.sort(arr);
        return arr[arr.length-3];
    }
}