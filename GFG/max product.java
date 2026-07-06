class Solution {
    int maxProduct(int[] arr) {
        // code here
        int sum1=1;
        int res=Integer.MIN_VALUE;
        int sum2=1;
        for(int i=0;i<arr.length;i++)
        {
            sum1*=arr[i];
            res=Math.max(res,sum1);
            if(sum1==0)
            {
                sum1=1;
            }
            sum2*=arr[arr.length-i-1];
            res=Math.max(res,sum2);
            if(sum2==0)
            {
                sum2=1;
            }
        }
        return res;
    }
}