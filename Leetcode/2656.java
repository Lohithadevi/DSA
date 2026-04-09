class Solution {
    public int maximizeSum(int[] nums, int k) {
        int curr=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>curr)
            {
                curr=nums[i];
            }
        }
        int sum=0;
       
        while(k>0)
        {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }
}