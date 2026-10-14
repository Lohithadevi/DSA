class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int f=0;
        int temp=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(temp==nums[i]) continue;
            temp=nums[i];
            c++;
            if(c==3)
            {
                f=1;
                break;
            }
        }
        return (f==1 ? temp : nums[nums.length-1]);
    }
}