class Solution {
    public int minimumCost(int[] nums) {
    int sum=nums[0];
    int n1=Integer.MAX_VALUE;
    int n2=Integer.MAX_VALUE;
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]<n1)
        {
            n2=n1;
            n1=nums[i];
        }
        else if(nums[i]<n2)
        {
            n2=nums[i];
        }
    }
    return sum+n1+n2;
    }
}