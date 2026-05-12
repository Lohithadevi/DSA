class Solution {
    public int[] concatWithReverse(int[] nums) {
        int res[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
            {
                res[i]=nums[i];
                res[res.length-1-i]=nums[i];
            }
        return res;
    }
}©leetcode