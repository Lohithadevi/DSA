class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int res=Integer.MIN_VALUE;
       int c=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==1)
        {
            c++;
        }
        else
        {
            res=res>c?res:c;
            c=0;
        }
       }
       return res>c?res:c; 
    }
}