class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.size();i++)
        {
            sum=0;
            for(int j=i;j<nums.size();j++)
            {
                int len=(j-i)+1;
                if(len > r) break;
                sum+=nums.get(j);
                if(len >= l  && len <=r)
                {
                    
                    if(sum > 0)
                    {
                        ans=Math.min(ans,sum);
                    }
                }
                
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}