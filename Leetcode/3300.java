class Solution {
    public int minElement(int[] nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
        int n=nums[i];
        int res=0;
        while(n!=0)
            {
                res=res+(n%10);
                n/=10;
            }
            min=min<res?min:res;
        }
        return min;
    }
}