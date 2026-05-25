class Solution {
    public int minimumSwaps(int[] nums) {
        int res=0;
         int s=0;
        int e=nums.length-1;
        while(s<e)
            {
                while(s<nums.length && nums[s]!=0) s++;
                while(e>=0 && nums[e]==0) e--;
                if(s<e)
                {
                    res++;
                    s++;
                    e--;
                }
            }
        return res;
    }
}