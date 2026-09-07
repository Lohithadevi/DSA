class Solution {
    public int countGoodRotations(int[] nums) {
        long left=0;
        long  right=0;
        int p2=nums.length/2;
        int p1=0;
        int res=0;
        for(int i=0;i<p2;i++)
        {
            left+=nums[i];
        }
        for(int i=p2;i<nums.length;i++)
        {
            right+=nums[i];
        }
        while(p2<nums.length)
        {
            
            if(left!=right)
            {
                
                res++;
            }
            left=left-nums[p1];
            right=right-nums[p2];
            left+=nums[p2];
            right+=nums[p1];
            p1++;
            p2++;
            
        }
        return res;
    }
}