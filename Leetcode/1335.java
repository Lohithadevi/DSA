class Solution {
    public int minDifficulty(int[] job, int d) {
        int n=job.length;
        if(n<d) return -1;
        int dp[][]=new int[n+1][d+1]; 
     for(int i=0;i<dp.length;i++)
     {
        Arrays.fill(dp[i],Integer.MAX_VALUE);
     }
     dp[0][0]=0;
     int max=Integer.MIN_VALUE;
     for(int i=1;i<=n;i++)
     {
        max=Math.max(max,job[i-1]);
        dp[i][1]=max;
     }
     for(int k=2;k<=d;k++)
     {
        for(int i=k;i<=n;i++)
        {
            int m=0;
            for(int j=i;j>=k;j--)
            {
                m=Math.max(m,job[j-1]);
                if(dp[j-1][k-1]!=Integer.MAX_VALUE)
                {
                    int left=dp[j-1][k-1];
                    dp[i][k]=Math.min(dp[i][k],left+m);
                }
            }
        }
     }
     return dp[n][d];
    }
   
}