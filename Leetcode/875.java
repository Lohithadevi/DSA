class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        int num=-1;
        for(int i=0;i<piles.length;i++)
        {
            high=Math.max(high,piles[i]);
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            long res=fun(mid,piles);
            
            if(res>h)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
                num=mid;
                

            }
        }
        
        return num;

    }
    public static long fun(int k,int[] piles)
    {
        long res=0;
        for(int i=0;i<piles.length;i++)
        {
            int q=piles[i]/k;
            int r=piles[i]%k;
            res+=q;
            if(r>0)
            {
                res++;
            }
        }
        return res;
    }
}