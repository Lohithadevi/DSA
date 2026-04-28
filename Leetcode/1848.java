class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int p1=start;
        int p2=start;
        while(p1>=0 && p2<nums.length)
        {
            int v1=Integer.MAX_VALUE;
            int v2=Integer.MAX_VALUE;
            if(nums[p1]==target)
            {
                v1=Math.abs(start-p1);
            }
            else if(nums[p2]==target)
            {
                v2=Math.abs(start-p2);
            }
            else
            {
                p1--;
                p2++;
                continue;
            }
            return Math.min(v1,v2);
        }
        while(p1>=0)
        {
            int v1=0;
            if(nums[p1]==target)
            {
                v1=Math.abs(start-p1);
            }
            else
            {
                p1--;
                continue;
            }
            return v1;
        }
        while(p2<nums.length)
        {
            int v2=0;
            if(nums[p2]==target)
            {
                v2=Math.abs(start-p2);
            }
            else
            {
                p2++;
                continue;
            }
            return v2;
        }
return 0;
    }
}