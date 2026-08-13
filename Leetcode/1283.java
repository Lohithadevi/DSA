class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            high=Math.max(high,nums[i]);
        }
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int res=fun(mid,nums);
            
            if(res<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    public static int fun(int div,int[] nums)
    {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max+=nums[i]/div;
            if((nums[i]%div)!=0)
            {
                max++;
            }
        }
        return max;
    }
}