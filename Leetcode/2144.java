class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==1) return cost[0];
        int res=0;
        Arrays.sort(cost);
        int i=0;
        for(i=cost.length-1;i>0;i=i-3)
        {
            
            res+=cost[i]+cost[i-1];
       
        }
        while(i>=0)
        {
            res+=cost[i];
            i--;
        }
        return res;
    }
}