class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int curr=nums[nums.length-1];
        while(k>0)
        {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }
}