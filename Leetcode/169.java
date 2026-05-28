class Solution {
    public int majorityElement(int[] nums) {
        int stop=nums.length/2;
        Arrays.sort(nums);
        if(nums.length==1 || nums.length==2) return nums[0];
        int i=0;
        int j=1;
        while(j<nums.length)
        {
            int c=1;
            while(j<nums.length && nums[i]==nums[j])
            {
                j++;
                c++;
            }
         
            if(c>stop) return nums[i];
            i=j;
            j++;
       
        }
        return nums[0];
    }
}