class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int curr=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] > nums[i-1])
            {
                curr++;
            }
            else
            {
                ans=Math.max(ans,curr);
                curr=1;
            }
        }
         ans=Math.max(ans,curr);
         curr=1;
         for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i] > nums[i+1])
            {
                curr++;
            }
            else
            {
                ans=Math.max(ans,curr);
                curr=1;
            }
        }
          ans=Math.max(ans,curr);
          return ans;
    }
}