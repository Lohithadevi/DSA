class Solution {
    public int[] countOppositeParity(int[] nums) {
        int e=0;
        int o=0;
        for(int i=nums.length-1;i>=0;i--)
            {
                if(nums[i]%2==0)
                {
                    nums[i]=o;
                    e++;
                }
                else
                {
                    nums[i]=e;
                    o++;
                }
            }
        return nums;
    }
}©leetcode