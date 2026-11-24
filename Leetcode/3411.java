class Solution {
    public int maxLength(int[] nums) {
        int ans=1;
        for(int i=0;i<nums.length;i++)
        {
            int l=nums[i];
            int g=nums[i];
            int pro=nums[i];

            for(int j=i+1;j<nums.length;j++)
            {
                pro*=nums[j];

                g=gcd(g,nums[j]);
                
                l=(l*nums[j])/gcd(l,nums[j]);
                if(pro==l*g)
                {
                    ans=Math.max(ans,(j-i)+1);
                }
            }
         
        }
           return ans;
        
    }
    public static int gcd(int a , int b)
    {
        return b==0 ? a : gcd(b,a%b);
    }
}