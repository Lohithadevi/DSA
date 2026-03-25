class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<=nums.length-3;i++)
        {
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==target) return sum;
                else if (sum>target)
                {
                    r--;
                }
                else
                {
                    l++;
                }
                int diff=Math.abs(target-sum);
                if(close>diff)
                {
                    
                    close=diff;
                    ans=sum;
                }
            }
        }
        return ans;
    }
}