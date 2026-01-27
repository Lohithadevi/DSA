class Solution {
    int mod=1000000007;
    public int countGoodNumbers(long n) {
    long even=(n+1)/2;
    long old=n/2;
    return((int)((power(5,even)*power(4,old))%mod));
    }
    public long power(long base,long exp)
    {
        if(exp==0) return 1;

        long half=power(base,exp/2);
        if(exp%2==0)
        return((half*half)%mod);
        return(base*half*half)%mod;
    }
}