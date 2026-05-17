class Solution {
    public static boolean fun(int[] arr,int start,int[] memo)
    {
        if(start<0 || start >=arr.length || memo[start]==1) return false;
        
        if(arr[start]==0) return true;
        memo[start]=1;
        return fun(arr,start+arr[start],memo) || fun(arr,start-arr[start],memo);
        
    }
    public boolean canReach(int[] arr, int start) {
        int memo[]=new int[arr.length];
        return fun(arr,start,memo);
    }
}