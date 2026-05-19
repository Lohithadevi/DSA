class Solution {
    public int countKthRoots(int l, int r, int k) {
        if(k==1) return r-l+1;
        int res=0;
        int i=0;
        while(true)
            {
            int d= (int) Math.pow(i,k); 
                if(d>=l && d<=r)
                {
                    res++;
                }
                else if(d>r) return res;
                i++;
            }
        
    }
}©leetcode