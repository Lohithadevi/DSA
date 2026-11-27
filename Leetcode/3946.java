class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int dp[]=new int[budget+1];
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<items.length;i++)
        {
            int curr=0;
            int n=items[i][0];
            for(int j=0;j<items.length;j++)
            {
                if(items[j][0]%n==0)
                {
                    curr++;
                }
            }
            map.put(i,curr);
        }
        for(int i=0;i<items.length;i++)
        {
            int cost=items[i][1];
            min=Math.min(min,cost);
            int val=map.get(i);
            for(int j=budget;j>=cost;j--)
            {
                dp[j]=Math.max(dp[j],val+dp[j-cost]);
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<=budget;i++)
        {
            ans=Math.max(ans,dp[i]+(budget-i)/min);
        }
        return ans;
    }
}