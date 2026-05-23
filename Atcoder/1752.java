class Solution {
    public boolean check(int[] nums) {
        int temp[]=new int[ nums.length];
        for(int i=0;i<nums.length;i++)
        {
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<nums.length;i++)
        {
            int f=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[(i+j)%nums.length]!=temp[j])
                {
                  
                    f=1;
                    break;
                }
            }
            if(f==0) return true;
        }
        return false;
    }
}