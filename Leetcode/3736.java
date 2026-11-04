class Solution {
    public int minMoves(int[] nums) {
        int move=0;
        Arrays.sort(nums);
        int tar=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++)
        {
            move+=tar-nums[i];
        }
        return move;
    }
}