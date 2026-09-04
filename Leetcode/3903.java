class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max[]=new int[nums.length];
        int min[]=new int[nums.length];
        int val=Integer.MIN_VALUE;
        int v=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max[i]=Math.max(val,nums[i]);
            val=max[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            min[i]=Math.min(v,nums[i]);
            v=min[i];
        }
       for(int i=0;i<nums.length;i++)
       {
        if(max[i]-min[i]<=k) return i;
       }
        return -1;


    }
}