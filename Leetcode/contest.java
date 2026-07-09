class Solution {
    public int maxDigitRange(int[] nums) {
        int res=0;
        int sum[]=new int[10];
        for(int i=0;i<nums.length;i++)
            {
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                int n=nums[i];
                while(n!=0){
                    int r=n%10;
                    min=Math.min(min,r);
                    max=Math.max(max,r);
                    n/=10;
                }
                
                int d=max-min;
                res=Math.max(res,d);
                
                sum[d]+=nums[i];
            }
      
        return sum[res];
        
    }
}