class Solution {
    public int minOperations(int[] nums, int x) {
        long pre[]=new long[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pre[i]=pre[i-1]+nums[i];
           
        }
        int tot=Integer.MAX_VALUE;
        int p1=0;
        long curr=0L;
        long bal;
        int coins=0;
        for(int i=nums.length;i>=0;i--)
        {
            if(i!=nums.length)
            {
                curr+=nums[i];
                coins=nums.length-i;
                if(curr==x)
                {
                    tot=Math.min(tot,coins);
                    break;
                }
                if(curr>x) break;
            }
           
            bal=x-curr;
            int res=fun(bal,pre,i-1);
            if(res!=-1)
            {
 tot=Math.min(tot,coins+res);
            }
                  
        }
        return tot==Integer.MAX_VALUE?-1:tot;
    }
    public static int fun(long bal, long[] pre , int e)
    {
        int s=0;
        while(s<=e)
        {
            int m=(s+e)/2;

            if(pre[m]==bal)
            {
                return m+1;
            }
            else if(pre[m]>bal)
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return  -1;
    }
}