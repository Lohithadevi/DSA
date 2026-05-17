class Solution {
    public static boolean fun(int[] arr,int start,int[] memo)
    {
        if(start<0 || start >=arr.length || memo[start]==1) return false;
        System.out.println(start);
        if(arr[start]==0) return true;
        memo[start]=1;
        int left=start+arr[start];
        int right=start-arr[start];

        boolean l=fun(arr,left,memo);
        boolean r=fun(arr,right,memo);
        return l || r;
    }
    public boolean canReach(int[] arr, int start) {
        int memo[]=new int[arr.length];
        return fun(arr,start,memo);
    }
}