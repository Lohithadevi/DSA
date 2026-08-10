class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       int low=Integer.MAX_VALUE;
       int high=Integer.MIN_VALUE;
       int res=-1;
       for(int i=0;i<bloomDay.length;i++)
       {
        int curr=bloomDay[i];
        low=low>curr? curr: low;
        high=high>curr?high:curr;
       }
       while(low<=high)
       {
        int mid=(low+high)/2;
        
        if(fun(mid,bloomDay,m,k)>=m)
        {
            res=mid;
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
       }
       return res;
    }
    public static int fun(int mid,int[] bloomDay,int m,int k)
    {
        int i=0;
        int res=0;
        while(i<bloomDay.length)
        {
            if(bloomDay[i]>mid)
            {
                i++;
                continue;
            }
            int c=0;
            while(i<bloomDay.length-1  && bloomDay[i]<=mid && bloomDay[i+1]<=mid)
            {
                c++;
                i++;
            }
            if(i<bloomDay.length && bloomDay[i]<=mid)
            {
                c++;
            }
            int have=c/k;
            res+=have;
            i++;
        }
        return res;
    }
}