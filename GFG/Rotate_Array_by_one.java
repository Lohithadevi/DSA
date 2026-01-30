// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int curr=arr[0];
        arr[0]=arr[arr.length-1];
        int help;
        int i=1;
        while(i<arr.length)
        {
            help=arr[i];
            arr[i]=curr;
            curr=help;
            i++;
        }
    }
}