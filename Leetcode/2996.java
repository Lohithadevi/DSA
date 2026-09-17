class Solution {
    public int missingInteger(int[] nums) {
        int arr[]=new int[51];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]=1;
        }

        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-1 == nums[i-1])
            {
                sum+=nums[i];
            }
            else break;
        }

      
        while(true)
        {
            if(sum >50 || arr[sum]==0) return sum;
            sum++;
        
        }



    }
}