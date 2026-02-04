class Solution {
    public boolean isPerfectSquare(int num) {
        long l=0;
        long r=num;
        while(l<=r)
        {
            long m=(l+r)/2;
            if(m*m==num) return true;
            if(m*m>num)
            {
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return false;
    }
}