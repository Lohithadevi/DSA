class Solution {
    public int findMin(int[] nums) {
        if(nums[0]<nums[nums.length-1]) return nums[0];
        int l=0;
        int h=nums.length-1;
        while(l<h)
        {
            int m=(l+h)/2;
            if(nums[l]==nums[m])
            {
                l++;
            }
            else if(nums[l]<nums[m])
            {
                l=m;
            }
            else
            {
                h=m;
            }
        }
        return nums[l];
    }
}