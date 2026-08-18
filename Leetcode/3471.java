class Solution {
    public int largestInteger(int[] nums, int k) {

        if (nums.length == k) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
            }
            return max;

        }
        int arr[] = new int[51];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        if (k == 1 || nums.length == 1) {
            int res = -1;
            for (int i = 0; i < nums.length; i++) {
                if (arr[nums[i]] == 1) {
                    res = Math.max(res, nums[i]);
                }
            }
            return res;
        }

        int f=arr[nums[0]];
        int l=arr[nums[nums.length-1]];

        

        if(l==1 && f==1)
        {
            return Math.max(nums[0],nums[nums.length-1]);
        }
      
        if(f==1)
        {
        
            return nums[0];
        }

        if(l==1)
        {
            return nums[nums.length-1];
        }

        return -1;

    }
}