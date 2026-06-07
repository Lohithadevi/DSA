class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int s=k+n;
        int res=0;
        for(int i=s;i>0;i--)
            {
                if(((i & n ) == 0 )&& (Math.abs(n-i)<=k))
                {
                    res+=i;
                }
            }
        return res;
    }
}